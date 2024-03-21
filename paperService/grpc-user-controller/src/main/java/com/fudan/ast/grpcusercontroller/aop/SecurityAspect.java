package com.fudan.ast.grpcusercontroller.aop;

import com.fudan.ast.grpc.lib.AuthServiceGrpc;
import com.fudan.ast.grpc.lib.JwtToken;
import com.fudan.ast.grpc.lib.ValidateResponse;
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
    public void checkPermission(JoinPoint joinPoint, CheckPermission checkPermission) throws Exception{
        String requireRole = checkPermission.value();

        String token = request.getHeader("Authorization");
        ValidateResponse validateResponse = authServiceBlockingStub.validate(JwtToken.newBuilder().setJwtToken(token).build());
        if (!validateResponse.getValid()) {
            throw new Exception("Invalid Token");
        }
        if (validateResponse.getRole().name().equals("ROLE_ADMIN")) {
            return;
        }
        if (!requireRole.equals(validateResponse.getRole().name())) {
            throw new Exception("Insufficient Permission");
        }

    }
}
