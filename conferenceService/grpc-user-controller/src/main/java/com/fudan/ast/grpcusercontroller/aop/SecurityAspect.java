package com.fudan.ast.grpcusercontroller.aop;

import com.fudan.ast.grpc.lib.AuthServiceGrpc;
import com.fudan.ast.grpc.lib.JwtToken;
import com.fudan.ast.grpc.lib.ValidateResponse;
import com.fudan.ast.grpcusercontroller.exception.InsufficientPermissionException;
import com.fudan.ast.grpcusercontroller.exception.InvalidTokenException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class SecurityAspect {

    @Autowired
    private HttpServletRequest request;

    @GrpcClient("grpc-auth-server")
    private AuthServiceGrpc.AuthServiceBlockingStub authServiceBlockingStub;

    @Before("@annotation(checkPermission)")
    public void checkPermission(JoinPoint joinPoint, CheckPermission checkPermission) {
        String requireRole = checkPermission.value();

        String token = request.getHeader("Authorization");
        if (token.isEmpty()) {
            throw new InvalidTokenException("Invalid Token");
        }
        ValidateResponse validateResponse = authServiceBlockingStub.validate(JwtToken.newBuilder().setJwtToken(token).build());
        if (!validateResponse.getValid()) {
            throw new InvalidTokenException("Invalid Token");
        }
        if (validateResponse.getRole().name().equals("ROLE_ADMIN")) {
            return;
        }
        if (!requireRole.equals(validateResponse.getRole().name())) {
            throw new InsufficientPermissionException("Insufficient Permission");
        }

    }
}
