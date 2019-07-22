package com.ligq.study.consumer.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableZuulProxy
@SpringBootApplication
public class ConsumerDemoApplication {

    public static void main(String[] args){
        SpringApplication.run(ConsumerDemoApplication.class, args);
    }
}
