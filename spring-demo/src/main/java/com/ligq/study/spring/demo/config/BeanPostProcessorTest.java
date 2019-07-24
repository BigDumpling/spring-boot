package com.ligq.study.spring.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BeanPostProcessorTest implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("helloSmartLifeCycle") || beanName.equals("Person")) {
            log.info("-------------BeanPostProcessorTest postProcessBeforeInitialization -----------, beanName == {}", beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("helloSmartLifeCycle") || beanName.equals("Person")) {
            log.info("-------------BeanPostProcessorTest postProcessAfterInitialization -----------, beanName == {}", beanName);
        }
        return bean;
    }
}
