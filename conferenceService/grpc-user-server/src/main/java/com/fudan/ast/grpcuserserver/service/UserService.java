package com.fudan.ast.grpcuserserver.service;

import com.fudan.ast.grpc.lib.*;
import com.fudan.ast.grpcuserserver.entity.User;
import com.fudan.ast.grpcuserserver.repository.UserRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@GrpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void getUserByName(GetUserByNameRequest request, StreamObserver<UserResponse> responseObserver) {
        String username = request.getUsername();
        Optional<List<User>> optionalUserList = userRepository.findAllByUsername(username);

        if (optionalUserList.isPresent()) {
            List<User> userList = optionalUserList.get();
            UserResponse.Builder responseBuilder = UserResponse.newBuilder();

            for (User user : userList) {
                responseBuilder.addUser(UserInfo.newBuilder()
                        .setUsername(user.getUsername())
                        .setEmail(user.getEmail())
                        .setAffiliation(user.getAffiliation())
                        .setLocation(user.getLocation())
                        .build());
            }

            UserResponse userResponse = responseBuilder.build();
            responseObserver.onNext(userResponse);
        } else {
            // 如果没有匹配的用户，返回一个空的 UserResponse
            UserResponse userResponse = UserResponse.newBuilder().build();
            responseObserver.onNext(userResponse);
        }
        responseObserver.onCompleted();
    }


}
