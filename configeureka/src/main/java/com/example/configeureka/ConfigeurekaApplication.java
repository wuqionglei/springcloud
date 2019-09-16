package com.example.configeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfigeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigeurekaApplication.class, args);
    }

}

