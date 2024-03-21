package com.fudan.ast.grpceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GrpcEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcEurekaServerApplication.class, args);
    }

}
