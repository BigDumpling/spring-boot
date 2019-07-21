package com.ligq.study.eureka.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class EurekaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDemoApplication.class, args);
    }
}
