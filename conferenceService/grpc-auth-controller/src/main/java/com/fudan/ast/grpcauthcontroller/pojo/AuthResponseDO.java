package com.fudan.ast.grpcauthcontroller.pojo;

import lombok.Data;

@Data
public class AuthResponseDO {

    private String jwtToken;
    private String message;

    public AuthResponseDO() {}

    public AuthResponseDO(String jwtToken, String message) {
        this.jwtToken = jwtToken;
        this.message = message;
    }

    public AuthResponseDO(String message) {
        this.message = message;
    }
}
