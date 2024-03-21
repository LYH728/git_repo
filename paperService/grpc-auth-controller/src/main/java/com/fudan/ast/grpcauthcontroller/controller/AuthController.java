package com.fudan.ast.grpcauthcontroller.controller;

import com.fudan.ast.grpc.lib.JwtTokenResponse;
import com.fudan.ast.grpcauthcontroller.pojo.AuthResponseDO;
import com.fudan.ast.grpcauthcontroller.pojo.LoginRequest;
import com.fudan.ast.grpcauthcontroller.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @RequestMapping("/login")
    public ResponseEntity<AuthResponseDO> login(@RequestBody LoginRequest loginRequest) {
        JwtTokenResponse jwtTokenResponse = authService.getJwtToken(loginRequest.getEmail(), loginRequest.getPassword());
        if (jwtTokenResponse.getValid()) {
            return ResponseEntity.ok(new AuthResponseDO(jwtTokenResponse.getJwtToken(), "login success!"));
        }
        return ResponseEntity.badRequest().body(new AuthResponseDO("Password mismatch or username does not exist."));
    }
}
