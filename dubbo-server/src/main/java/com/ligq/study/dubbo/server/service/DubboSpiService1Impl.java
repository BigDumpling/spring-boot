package com.ligq.study.dubbo.server.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DubboSpiService1Impl implements DubboSpiService {
    @Override
    public String sayHello(String name) {
        log.info("DubboSpiService1Impl sayHello, name == {}", name);
        return "Hello " + name;
    }
}
