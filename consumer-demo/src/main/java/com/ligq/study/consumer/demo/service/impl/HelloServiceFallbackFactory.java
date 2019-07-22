package com.ligq.study.consumer.demo.service.impl;

import com.ligq.study.consumer.demo.service.HelloService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloServiceFallbackFactory implements FallbackFactory<HelloService> {

    @Override
    public HelloService create(Throwable cause) {
        return new HelloService(){
            @Override
            public String sayHello() {
                String result = "HelloService.sayHello Hystrix fallback";
                log.info("HelloService.Hystrix fallback == {}", result);
                return result;
            }
        };
    }
}
