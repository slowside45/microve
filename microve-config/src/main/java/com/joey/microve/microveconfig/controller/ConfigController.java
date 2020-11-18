package com.joey.microve.microveconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Joey Lee
 * @Date 2020/11/16
 * @Desc
 */

@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Value("${config.enable:}")
    private String configStatus;

    @GetMapping
    public String getConfig(){
        return configStatus;
    }
}
