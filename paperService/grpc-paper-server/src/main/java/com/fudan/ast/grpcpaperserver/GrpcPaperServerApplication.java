package com.fudan.ast.grpcpaperserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GrpcPaperServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcPaperServerApplication.class, args);
    }

}
