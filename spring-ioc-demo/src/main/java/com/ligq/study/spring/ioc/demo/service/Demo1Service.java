package com.ligq.study.spring.ioc.demo.service;

import com.ligq.study.spring.ioc.demo.config.IocDemoBeanFactoryPostProcessor2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class Demo1Service implements InitializingBean {

    @Autowired
    private IocDemoBeanFactoryPostProcessor2 iocDemoBeanFactoryPostProcessor2;
//
//    public Demo1Service(){}
//
//
//    @Autowired(required = false)
//    public Demo1Service(IocDemoBeanFactoryPostProcessor2 ioc){
//        log.info("IocDemoBeanFactoryPostProcessor2 ioc ");
//    }
//
//    @Autowired(required = false)
//    public Demo1Service(IocDemoBeanFactoryPostProcessor2 ioc, String name){
//        log.info("IocDemoBeanFactoryPostProcessor2 ioc, name ");
//    }

//    @Transactional
    public void demo() {
        log.info("PostConstruct Demo1Service demo");
        throw new RuntimeException("test");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("InitializingBean Demo1Service demo");
    }
}
