package com.ligq.study.spring.cloud.demo.api.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "spring-demo")
public interface HelloService {

    @GetMapping(value = "/hello")
    String hello();
}
