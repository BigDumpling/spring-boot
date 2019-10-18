package com.ligq.study.mybatis.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import tk.mybatis.spring.annotation.MapperScan;

@Slf4j
@MapperScan(basePackages = "com.ligq.study.mybatis.demo.dao")
@SpringBootApplication
public class MybatisDemoApplication {
    public static void main(String[] args) {
        log.info("---- start ----");
        new SpringApplicationBuilder(MybatisDemoApplication.class).web(WebApplicationType.SERVLET).run();
    }
}
