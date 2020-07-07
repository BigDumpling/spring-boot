package com.ligq.study.sping.ioc.demo.service;

import com.ligq.study.sping.ioc.demo.config.IocDemoBeanFactoryPostProcessor2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Demo1Service {

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

    public void demo() {
        log.info("Demo1Service demo");
    }
}
