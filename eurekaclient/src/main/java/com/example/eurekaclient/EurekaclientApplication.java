package com.example.eurekaclient;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//引入RestController注解

import org.springframework.web.bind.annotation.RestController;
//引入Value注解
import org.springframework.beans.factory.annotation.Value;
//引入RequestMapping注解
import org.springframework.web.bind.annotation.RequestMapping;
//引入参数注解
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}

