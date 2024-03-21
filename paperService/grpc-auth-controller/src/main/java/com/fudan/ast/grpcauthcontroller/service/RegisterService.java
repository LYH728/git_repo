package com.fudan.ast.grpcauthcontroller.service;

import com.fudan.ast.grpc.lib.RegisterServiceGrpc;
import com.fudan.ast.grpc.lib.RegisterUserRequest;
import com.fudan.ast.grpc.lib.RegisterUserResponse;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @GrpcClient("grpc-auth-server")
    private RegisterServiceGrpc.RegisterServiceBlockingStub registerServiceBlockingStub;

    public RegisterUserResponse register(String userName, String password, String email, String affiliation, String location) {
        return registerServiceBlockingStub.registerUser(RegisterUserRequest.newBuilder()
                .setUsername(userName)
                        .setPassword(password)
                        .setEmail(email)
                        .setAffiliation(affiliation)
                        .setLocation(location)
                .build());
    }
}
