package com.fudan.ast.grpcpaperserver.util;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RandomIDBuilder {
    public String generateRandomID(){
        return UUID.randomUUID().toString();
    }
}
