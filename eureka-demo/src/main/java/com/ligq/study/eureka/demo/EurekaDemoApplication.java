package com.ligq.study.eureka.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class EurekaDemoApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaDemoApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
