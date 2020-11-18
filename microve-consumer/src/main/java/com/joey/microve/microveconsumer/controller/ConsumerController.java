package com.joey.microve.microveconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Joey Lee
 * @Date 2020/11/14
 * @Desc
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{str}")
    public String getProvider(@PathVariable String str){
        return restTemplate.getForObject("http://service-provider/test/" + str, String.class);
    }
}
