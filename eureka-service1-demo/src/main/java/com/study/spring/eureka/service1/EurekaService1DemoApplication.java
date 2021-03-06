package com.study.spring.eureka.service1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class EurekaService1DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService1DemoApplication.class, args);
    }
}
