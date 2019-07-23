package com.ligq.study.provider.demo.control;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class ProviderController {

    @GetMapping("/provider/demo")
    public String providerDemo(){
        log.info("------------------ Provider-demo -------------------------");
        return "Provider-demo";
    }

    @GetMapping("/consumer/demo")
    public String consumerDemo(){
        log.info("------------------ Provider-demo -------------------------");
        return "Provider-Consumer-demo";
    }

    @GetMapping("/demo")
    public String demo(){
        log.info("------------------ Provider-demo -------------------------");
        return "Provider-demo2";
    }
}
