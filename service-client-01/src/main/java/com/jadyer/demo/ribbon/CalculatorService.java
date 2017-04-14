package com.jadyer.demo.ribbon;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
class CalculatorService {
    @Resource
    private RestTemplate restTemplate;

    int addService(int a, int b){
        String reqURL = "http://CalculatorServer/add?a=" + a + "&b=" + b;
        return restTemplate.getForEntity(reqURL, Integer.class).getBody();
    }
}