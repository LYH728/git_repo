package com.fudan.ast.grpcauthcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GrpcAuthControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcAuthControllerApplication.class, args);
    }

}
