package com.fudan.ast.grpcusercontroller.service;

import com.fudan.ast.grpc.lib.GetUserByNameRequest;
import com.fudan.ast.grpc.lib.UserInfo;
import com.fudan.ast.grpc.lib.UserResponse;
import com.fudan.ast.grpc.lib.UserServiceGrpc;
import com.fudan.ast.grpcusercontroller.pojo.UserDO;
import com.fudan.ast.grpcusercontroller.pojo.UserResponseDO;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @GrpcClient("grpc-user-server")
    private UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    public UserResponseDO getUserByName(String userName) {
        // Call the getUserByName service
        UserResponse response = userServiceBlockingStub.getUserByName(GetUserByNameRequest.newBuilder().setUsername(userName).build());

        UserResponseDO responseDO = new UserResponseDO();
        List<UserDO> userDOList = new ArrayList<>();

        for (UserInfo userInfo : response.getUserList()) {
            UserDO userDO = new UserDO();
            userDO.setUsername(userInfo.getUsername());
            userDO.setEmail(userInfo.getEmail());
            userDO.setAffiliation(userInfo.getAffiliation());
            userDO.setLocation(userInfo.getLocation());
            userDOList.add(userDO);
        }

        responseDO.setUsers(userDOList);

        return responseDO;
    }

}
