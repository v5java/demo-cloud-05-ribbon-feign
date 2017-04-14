package com.jadyer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 通过 @EnableEurekaClient 注解，为服务提供方赋予注册和发现服务的能力
 * ------------------------------------------------------------------------------------------------------------------
 * 也可以使用org.springframework.cloud.client.discovery.@EnableDiscoveryClient注解
 * 详见以下两篇文章的介绍
 * http://cloud.spring.io/spring-cloud-static/Camden.SR3/#_registering_with_eureka
 * https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka
 * ------------------------------------------------------------------------------------------------------------------
 * Created by 玄玉<https://jadyer.github.io/> on 2017/1/9 16:00.
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceServer01BootStarp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceServer01BootStarp.class, args);
    }
}