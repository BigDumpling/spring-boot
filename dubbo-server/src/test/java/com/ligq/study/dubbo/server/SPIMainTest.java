/*
 * Copyright (c) 2019. EverBright Yunfu Internet CO.,LTD. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential.
 */

package com.ligq.study.dubbo.server;

import com.ligq.study.dubbo.api.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.ServiceLoader;

/**
 * class
 *
 * @author LiGuoQiang
 * @description
 * @date 2019/5/7 0007,14:20
 */
@Slf4j
@RunWith(BlockJUnit4ClassRunner.class)
public class SPIMainTest {

    @Test
    public void jdkSPITest(){
        ServiceLoader<HelloWorldService> demoServices = ServiceLoader.load(HelloWorldService.class);
        log.info("test start");
        for (HelloWorldService d : demoServices){
            d.sayHello("ligq");
        }
    }
}
