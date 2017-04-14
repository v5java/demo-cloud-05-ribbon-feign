package com.jadyer.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CalculatorController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private DiscoveryClient client;

    @RequestMapping("/add")
    public int add(int a, int b){
        int result = a + b;
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("uri={}，serviceId={}，result={}", instance.getUri(), instance.getServiceId(), result);
        return result;
    }
}