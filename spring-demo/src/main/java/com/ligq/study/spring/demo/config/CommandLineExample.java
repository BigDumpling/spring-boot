package com.ligq.study.spring.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class CommandLineExample implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("----- CommandLineExample -----");
    }
}
