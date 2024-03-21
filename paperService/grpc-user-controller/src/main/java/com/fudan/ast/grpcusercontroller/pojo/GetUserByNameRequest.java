package com.fudan.ast.grpcusercontroller.pojo;

import lombok.Data;

@Data
public class GetUserByNameRequest {
    private String userName;

    public GetUserByNameRequest() {
    }

    public GetUserByNameRequest(String userName) {
        this.userName = userName;
    }
}
