package com.ligq.study.dubbo.client.control;

import com.ligq.study.dubbo.api.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloWorldControl {

    @Reference(version = "1.0")
    private HelloWorldService helloWorldService;

    @GetMapping(path = "/hello/{name}")
    public String hello(@PathVariable String name){
        log.info("HelloWorldControl.hello, name == {}", name);
        String result = helloWorldService.sayHello(name);
        log.info("HelloWorldControl.hello, result == {}", result);
        return result;
    }
}
