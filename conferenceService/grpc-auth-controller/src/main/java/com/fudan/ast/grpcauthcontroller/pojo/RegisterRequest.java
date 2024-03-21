package com.fudan.ast.grpcauthcontroller.pojo;

import lombok.Data;

@Data
public class RegisterRequest {

    private String userName;
    private String password;
    private String email;
    private String affiliation;
    private String location;

    public RegisterRequest(String userName, String password, String email, String affiliation, String location) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.affiliation = affiliation;
        this.location = location;
    }
}
