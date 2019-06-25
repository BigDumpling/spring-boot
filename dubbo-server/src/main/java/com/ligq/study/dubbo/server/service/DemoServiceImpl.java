/*
 * Copyright (c) 2019. EverBright Yunfu Internet CO.,LTD. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential.
 */

package com.ligq.study.dubbo.server.service;

import com.ligq.study.dubbo.api.service.HelloWorldService;
import org.apache.dubbo.config.annotation.Service;

/**
 * class
 *
 * @author LiGuoQiang
 * @description
 * @date 2019/5/7 0007,11:26
 */
@Service(version = "1.0")
public class DemoServiceImpl implements HelloWorldService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
