package com.ligq.study.spring.cloud.demo.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class HelloWorldApi {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(name = "/hello/name", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String hello() {
        log.info("Hello");
        log.info("服务调用");
        String name = restTemplate.getForObject("http://spring-demo/world", String.class);
        log.info("name == {}", name);
        return name;
    }
}
