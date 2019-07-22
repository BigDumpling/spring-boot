package com.ligq.study.consumer.demo.service.impl;

import com.ligq.study.consumer.demo.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
//@Component(value = "helloServiceFallBack")
public class HelloServiceFallBack implements HelloService {
    @Override
    public String sayHello() {
        String result = "HelloService.sayHello Hystrix fallback";
        log.info("HelloService.Hystrix fallback == {}", result);
        return result;
    }
}
