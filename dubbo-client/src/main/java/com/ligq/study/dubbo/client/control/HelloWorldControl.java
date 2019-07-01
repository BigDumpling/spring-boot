package com.ligq.study.dubbo.client.control;

import com.ligq.study.dubbo.api.service.AsyncService;
import com.ligq.study.dubbo.api.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@Slf4j
@RestController
public class HelloWorldControl {

    @Reference(version = "1.0", loadbalance = "random", cluster = "failover")
    private HelloWorldService helloWorldService;

    private AsyncService asyncService;

    @GetMapping(path = "/hello/{name}")
    public String hello(@PathVariable String name){
        log.info("HelloWorldControl.hello, name == {}", name);
        String result = helloWorldService.sayHello(name);
        log.info("HelloWorldControl.hello, result == {}", result);
        return result;
    }

    @GetMapping(path = "/hello/async/{name}")
    public String asyncHello(@PathVariable String name){
        CompletableFuture<String> future = asyncService.sayHello(name);
        future.whenComplete((retValue, exception) -> {
            if(exception != null){
                exception.printStackTrace();
            }

            log.info("HelloWorldControl.asyncHello, result == {}", retValue);
        });

        return "";
    }
}
