package com.ligq.study.sping.ioc.demo.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Children extends Father {

    public Children() {
//        this("ligq");
        super("ni");
        log.info("Children void");
    }

    public Children(String name) {
        log.info("Children name");
    }
}
