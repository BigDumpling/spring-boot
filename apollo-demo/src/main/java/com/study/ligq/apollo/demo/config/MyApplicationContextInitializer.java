/**
 * @Description
 * @Author Ligq
 * @Date 2021/1/12 5:59 下午
 * @Version V1.0
 */
package com.study.ligq.apollo.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
public class MyApplicationContextInitializer implements ApplicationContextInitializer  {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        log.info("MyApplicationContextInitializer init");
    }
}
