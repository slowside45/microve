package com.joey.microve.microveprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Joey Lee
 * @Date 2020/11/14
 * @Desc
 */
@RestController
public class TestController {
    @GetMapping("/test/{s}")
    public String test(@PathVariable String s){
        return s;
    }
}
