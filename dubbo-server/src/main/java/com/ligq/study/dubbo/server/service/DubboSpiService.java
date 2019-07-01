package com.ligq.study.dubbo.server.service;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface DubboSpiService {
    String sayHello(String name);
}
