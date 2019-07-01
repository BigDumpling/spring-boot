package com.ligq.study.dubbo.server.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DubboSpiService2Impl implements DubboSpiService {
    @Override
    public String sayHello(String name) {
        log.info("DubboSpiService2Impl sayHello, name == {}", name);
        return "Hello2 " + name;
    }
}
