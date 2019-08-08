package com.ligq.study.spring.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BeanFactoryPostProcessorTest implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("-------------------BeanFactoryPostProcessorTest.postProcessBeanFactory()--------------------------, beanCount == {}, beanNames == {}",
                beanFactory.getBeanDefinitionCount(),
                beanFactory.getBeanDefinitionNames());
    }
}
