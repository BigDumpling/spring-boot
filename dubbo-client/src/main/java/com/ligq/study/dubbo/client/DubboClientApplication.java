/*
 * Copyright (c) 2019. EverBright Yunfu Internet CO.,LTD. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 *
 * Proprietary and confidential.
 */

package com.ligq.study.dubbo.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * class
 *
 * @author LiGuoQiang
 * @description
 * @date 2019/5/7 0007,10:49
 */
@Slf4j
@SpringBootApplication
public class DubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboClientApplication.class, args);
    }
}
