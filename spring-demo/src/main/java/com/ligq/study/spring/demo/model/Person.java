package com.ligq.study.spring.demo.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Bean生命周期回调实例
 * 优先级： @PostConstruct > InitializingBean.afterPropertiesSet > @Bean(initMethod)
 */
@Slf4j
public class Person implements InitializingBean, DisposableBean {

    @PostConstruct
    public void initPost() {
        log.info("Bean1 init-method == initPost()");
    }

    public void init() {
        log.info("Bean3 init-method == init()");
    }

    @PreDestroy
    public void shutdownPre() {
        log.info("Bean1 destroy-method == shutdownPre()");
    }

    public void shutdown() {
        log.info("Bean3 destroy-method == shutdown()");
    }

    @Override
    public void destroy() throws Exception {
        log.info("Bean2 destroy-method == destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Bean2 init-method == afterPropertiesSet()");
    }
}
