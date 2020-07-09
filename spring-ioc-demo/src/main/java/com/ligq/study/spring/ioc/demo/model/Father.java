package com.ligq.study.spring.ioc.demo.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Father {

    public Father() {
        this("father");
        log.info("Father void");
    }

    public Father(String name){
        log.info("Father name");
    }
}
