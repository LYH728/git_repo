package com.fudan.ast.grpcusercontroller.pojo;

import lombok.Data;

import java.util.List;

@Data
public class UserResponseDO {
    private List<UserDO> users;
}
