package com.ligq.study.consumer.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider-demo")
public interface HelloService {

    @GetMapping("/provider/demo")
    String sayHello();
}
