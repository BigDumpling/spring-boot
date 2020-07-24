package com.ligq.study.spring.cloud.demo.api;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class HelloWorldApi {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloGetFallback")
    @GetMapping(value = "/hello/{name}")
    public String helloGet(@PathVariable("name") String name) {
        log.info("helloGet, name == {}", name);
        log.info("服务调用");
        String result = restTemplate.getForObject("http://spring-demo/world", String.class);
        log.info("name == {}", result);
        return result;
    }

//    @HystrixCommand(fallbackMethod = "helloFallback")
//    @PostMapping(name = "/hello/name", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public String helloPost(Map<String, Object> map) {
//        log.info("Hello");
//        log.info("服务调用");
//        String name = restTemplate.getForObject("http://spring-demo/world", String.class);
//        log.info("name == {}", name);
//        return name;
//    }

    public String helloGetFallback(String name) {
        log.info("helloFallback, name == {}", name);
        return "error";
    }
}
