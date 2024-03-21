package com.fudan.ast.conferencecontroller.aop;


import com.fudan.ast.conferencecontroller.service.JwtUtil;
import com.fudan.ast.grpc.lib.ValidateResponse;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Aspect
@Component
public class SecurityAspect {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private JwtUtil jwtUtil;

    @Before("@annotation(checkPermission)")
    public void checkPermission(JoinPoint joinPoint, CheckPermission checkPermission) throws Exception {
        // 获取请求的令牌（Token）
        String token = request.getHeader("Authorization");
        ValidateResponse validateResponse=jwtUtil.validateToken(token);
        if (!validateResponse.getValid() || !Objects.equals(checkPermission.value(), validateResponse.getRole().name())) {
            throw new Exception("Insufficient permission");
        }

    }

}
