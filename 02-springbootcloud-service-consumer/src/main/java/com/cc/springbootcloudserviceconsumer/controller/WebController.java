package com.cc.springbootcloudserviceconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/web/hello")
    public String hello(){
       return restTemplate.getForEntity("http://localhost:8877/hello", String.class).getBody();
    }
}
