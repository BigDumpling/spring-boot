package com.ligq.study.feign.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "spring-demo")
public interface HelloService {

    @GetMapping(value = "/hello/{name}")
    String hello(@PathVariable(value = "name") String name);
}
