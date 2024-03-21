package com.fudan.ast.conferencecontroller.service;

import com.fudan.ast.grpc.lib.AuthServiceGrpc;
import com.fudan.ast.grpc.lib.Conference.ConferenceServiceGrpc;
import com.fudan.ast.grpc.lib.JwtToken;
import com.fudan.ast.grpc.lib.ValidateResponse;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {
    private static final String SECRET_KEY = "IMCSecretKey";
    @GrpcClient("grpc-auth-server")
    private AuthServiceGrpc.AuthServiceBlockingStub authServiceBlockingStub;

    public ValidateResponse validateToken(String token) {
        JwtToken jwtToken=JwtToken.newBuilder().setJwtToken(token).build();
        return authServiceBlockingStub.validate(jwtToken);
    }


}
