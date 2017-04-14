package com.jadyer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

//开启Feign功能
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ServiceClient02BootStarp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceClient02BootStarp.class, args);
    }
}