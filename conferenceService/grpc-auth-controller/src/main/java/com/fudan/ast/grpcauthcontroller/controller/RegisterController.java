package com.fudan.ast.grpcauthcontroller.controller;

import com.fudan.ast.grpc.lib.RegisterUserResponse;
import com.fudan.ast.grpcauthcontroller.pojo.RegisterRequest;
import com.fudan.ast.grpcauthcontroller.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @RequestMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest registerRequest) {
        RegisterUserResponse registerUserResponse = registerService.register(registerRequest.getUserName(),
                registerRequest.getPassword(),
                registerRequest.getEmail(),
                registerRequest.getAffiliation(),
                registerRequest.getLocation());
        if (registerUserResponse.getState()) {
            return ResponseEntity.ok("Success!");
        }
        return ResponseEntity.badRequest().body(registerUserResponse.getMessage());
    }
}
