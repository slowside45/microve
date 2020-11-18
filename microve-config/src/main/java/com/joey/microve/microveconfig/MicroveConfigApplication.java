package com.joey.microve.microveconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroveConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroveConfigApplication.class, args);
    }

}
