package com.fudan.ast.grpcauthserver.service;

import com.fudan.ast.grpc.lib.*;
import com.fudan.ast.grpcauthserver.entity.User;
import com.fudan.ast.grpcauthserver.repository.UserRepository;
import io.grpc.stub.StreamObserver;
import lombok.Getter;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@GrpcService
public class RegisterService extends RegisterServiceGrpc.RegisterServiceImplBase {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUser(RegisterUserRequest request, StreamObserver<RegisterUserResponse> responseObserver) {
        RegisterUserResponse registerUserResponse = isUserDataValid(request);
        if (!registerUserResponse.getState()) {
            responseObserver.onNext(registerUserResponse);
            responseObserver.onCompleted();
            return;
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        user.setAffiliation(request.getAffiliation());
        user.setLocation(request.getLocation());
        user.setIs_admin(false);

        try {
            User registeredUser = userRepository.save(user);
            responseObserver.onNext(RegisterUserResponse.newBuilder()
                    .setId(registeredUser.getId())
                    .setState(true)
                    .setMessage("Success!")
                    .build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onNext(RegisterUserResponse.newBuilder()
                    .setId(-1)
                    .setState(false)
                    .setMessage(e.getMessage())
                    .build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void validateEmail(ValidateEmailRequest request, StreamObserver<ValidateEmailResponse> responseObserver) {
        Optional<User> optionalUser = userRepository.findByEmail(request.getEmail());
        boolean isValid = !optionalUser.isPresent(); // Check if the username is not present in the repository
        responseObserver.onNext(ValidateEmailResponse.newBuilder().setValid(isValid).build());
        responseObserver.onCompleted();
    }

    public RegisterUserResponse isUserDataValid(RegisterUserRequest request) {
        boolean isUsernameValid = isValidUsername(request.getUsername());
        boolean isPasswordValid = isValidPassword(request.getPassword());
        boolean isEmailValid = isValidEmail(request.getEmail());
        boolean isEmailInUse = isEmailInUse(request.getEmail());

        if (isUsernameValid && isPasswordValid && isEmailValid && !isEmailInUse) {
            return RegisterUserResponse.newBuilder().setState(true).build();
        } else {
            StringBuilder message = new StringBuilder("Invalid user data. Reasons: ");
            if (!isUsernameValid) {
                message.append("Invalid username. ");
            }
            if (!isPasswordValid) {
                message.append("Invalid password. ");
            }
            if (!isEmailValid) {
                message.append("Invalid email. ");
            }
            if (isEmailInUse) {
                message.append(request.getEmail()).append(" is in use. ");
            }
            return RegisterUserResponse.newBuilder().setId(-1).setState(false).setMessage(message.toString()).build();
        }
    }

    private boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z\\-_][a-zA-Z0-9\\-_]{4,31}$");
    }

    private boolean isValidPassword(String password) {
        return password.matches("^(?=.*[a-zA-Z])(?=.*[0-9\\-_]).{6,32}$");
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    private boolean isEmailInUse(String email) {
        try {
            Optional<User> existingUser = userRepository.findByEmail(email);
            return existingUser.isPresent();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

}
