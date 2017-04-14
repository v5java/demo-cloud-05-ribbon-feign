package com.jadyer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceServer02BootStarp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceServer02BootStarp.class, args);
    }
}