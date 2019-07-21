package com.ligq.study.consumer.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class ConsumerDemoApplication {

    public static void main(String[] args){
        SpringApplication.run(ConsumerDemoApplication.class, args);
    }
}
