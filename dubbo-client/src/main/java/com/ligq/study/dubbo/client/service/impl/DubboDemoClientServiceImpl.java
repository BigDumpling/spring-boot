/*
 * Copyright (c) 2019. EverBright Yunfu Internet CO.,LTD. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential.
 */

package com.ligq.study.dubbo.client.service.impl;

import com.ligq.study.dubbo.client.service.DubboDemoClientService;
import com.ligq.study.dubbo.server.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * class
 *
 * @author LiGuoQiang
 * @description
 * @date 2019/5/7 0007,15:20
 */
@Service
public class DubboDemoClientServiceImpl implements DubboDemoClientService {

    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:20880")
    private DemoService demoService;

    @Override
    public void doRequest() {
        demoService.sayHello("name");
    }
}
