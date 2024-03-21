package com.fudan.ast.grpcauthcontroller.service;

import com.fudan.ast.grpc.lib.AuthServiceGrpc;
import com.fudan.ast.grpc.lib.JwtRequest;
import com.fudan.ast.grpc.lib.JwtToken;
import com.fudan.ast.grpc.lib.JwtTokenResponse;
import com.fudan.ast.grpcauthcontroller.pojo.AuthResponseDO;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @GrpcClient("grpc-auth-server")
    private AuthServiceGrpc.AuthServiceBlockingStub authServiceBlockingStub;

    public JwtTokenResponse getJwtToken(String email, String password) {
        return authServiceBlockingStub.generateJwtToken(JwtRequest.newBuilder().setEmail(email).setPassword(password).build());
    }
}
