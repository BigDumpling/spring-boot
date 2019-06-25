/*
 * Copyright (c) 2019. EverBright Yunfu Internet CO.,LTD. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential.
 */

package com.ligq.study.dubbo.server.service;

import com.ligq.study.dubbo.api.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;

/**
 * class
 *
 * @author LiGuoQiang
 * @description
 * @date 2019/5/7 0007,14:17
 */
@Slf4j
public class DemoService2Impl implements HelloWorldService {
    @Override
    public String sayHello(String name) {
        log.info("DemoService2Impl name == {}", name);
        return "DemoService2Impl " + name;
    }
}
