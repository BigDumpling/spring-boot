/*
 * Copyright (c) 2019. EverBright Yunfu Internet CO.,LTD. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential.
 */

package com.ligq.study.dubbo.client.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * class
 *
 * @author LiGuoQiang
 * @description
 * @date 2019/5/7 0007,15:28
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboDemoClientServiceTest {

    @Autowired
    private DubboDemoClientService dubboDemoClientService;

    @Test
    public void demoTest(){
        dubboDemoClientService.doRequest();
    }
}
