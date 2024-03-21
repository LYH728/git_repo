package com.fudan.ast.grpcusercontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GrpcUserControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcUserControllerApplication.class, args);
    }

}
