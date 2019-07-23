package com.ligq.study.consumer.demo.service;

import com.ligq.study.consumer.demo.service.impl.HelloServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "${feign.name}", fallbackFactory = HelloServiceFallbackFactory.class)
public interface HelloService {

    @GetMapping("/provider/demo")
    String sayHello();
}
