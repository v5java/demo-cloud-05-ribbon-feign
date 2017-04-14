package com.jadyer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//创建服务注册中心
@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoveryBootStrap {
    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryBootStrap.class, args);
    }
}