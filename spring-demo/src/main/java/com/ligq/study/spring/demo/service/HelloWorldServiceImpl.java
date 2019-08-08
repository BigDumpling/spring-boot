package com.ligq.study.spring.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloWorldServiceImpl {

    public void sayHello(){
        log.info("---------------------------- sayHello() ----------------------------");
    }
}
