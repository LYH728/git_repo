package com.fudan.ast.grpcusercontroller.pojo;

import lombok.Data;

@Data
public class UserDO {

    private String username;
    private String email;
    private String affiliation;
    private String location;

}
