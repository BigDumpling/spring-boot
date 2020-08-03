package com.ligq.study.feign.client.api;

import com.ligq.study.feign.client.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloApi {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/feign-consumer")
    public String helloConsumer() {
        log.info("调用开始");
        String result = helloService.hello("QXQ");
        log.info("调用结束，result == {}", result);
        return result;
    }
}
