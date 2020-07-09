package com.ligq.study.spring.ioc.demo.service;

import com.ligq.study.spring.ioc.demo.config.IocDemoBeanFactoryPostProcessor2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoService implements InitializingBean {

    public void demo() {
        log.info("PostConstruct DemoService demo");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("InitializingBean DemoService demo");
    }
}
