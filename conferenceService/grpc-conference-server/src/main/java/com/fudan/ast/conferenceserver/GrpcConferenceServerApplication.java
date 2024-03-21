package com.fudan.ast.conferenceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GrpcConferenceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcConferenceServerApplication.class, args);
    }
    
}
