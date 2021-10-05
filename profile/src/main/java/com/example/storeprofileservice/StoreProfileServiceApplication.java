package com.example.storeprofileservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StoreProfileServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreProfileServiceApplication.class, args);
    }

}
