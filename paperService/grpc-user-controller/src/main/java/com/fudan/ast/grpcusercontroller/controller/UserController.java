package com.fudan.ast.grpcusercontroller.controller;

import com.fudan.ast.grpcusercontroller.aop.CheckPermission;
import com.fudan.ast.grpcusercontroller.pojo.GetUserByNameRequest;
import com.fudan.ast.grpcusercontroller.pojo.UserResponseDO;
import com.fudan.ast.grpcusercontroller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @CheckPermission("ROLE_USER")
    @RequestMapping("/getUserByName")
    public ResponseEntity<UserResponseDO> getUserByName(@RequestBody GetUserByNameRequest getUserByNameRequest) {
        return ResponseEntity.ok(userService.getUserByName(getUserByNameRequest.getUserName()));
    }
}
