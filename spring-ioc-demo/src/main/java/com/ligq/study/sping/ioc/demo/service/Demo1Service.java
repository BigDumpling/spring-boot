package com.ligq.study.sping.ioc.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Demo1Service {

    public void demo() {
        log.info("Demo1Service demo");
    }
}
