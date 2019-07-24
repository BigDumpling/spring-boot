package com.ligq.study.spring.demo.control;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class HelloWorldController {

    @GetMapping("/world")
    public String hello(){
        return "Hello World";
    }
}
