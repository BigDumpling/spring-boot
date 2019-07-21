package com.ligq.study.consumer.demo.controller;

import com.ligq.study.consumer.demo.service.HelloService;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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

    /**
     * 模拟loadBalancerClient客户端
     */
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private HelloService helloService;

    @GetMapping("/demo")
    @Hystrix
    public String consumerDemo() {
        String result = this.restTemplate.getForObject("http://provider-demo/provider/demo", String.class);
        log.info("result == {}", result);
        return result;
    }

    @GetMapping("/info")
    public void getInterfaceInfo() {
        ServiceInstance choose = loadBalancerClient.choose("provider-demo");
        log.info("choose port == {}", choose.getPort());
    }

    @GetMapping("/feign")
    public String getFeign() {
        String result = helloService.sayHello();
        log.info("result == {}", result);
        return result;
    }
}
