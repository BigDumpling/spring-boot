package com.ligq.study.consumer.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/demo")
    public void consumerDemo(){
        String result = this.restTemplate.getForObject("http://127.0.0.1:9001/provider/demo", String.class);
        log.info("result == {}", result);
    }
}
