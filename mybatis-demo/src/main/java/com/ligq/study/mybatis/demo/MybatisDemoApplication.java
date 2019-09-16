package com.ligq.study.mybatis.demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MybatisDemoApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(MybatisDemoApplication.class).web(WebApplicationType.SERVLET).run();
    }
}
