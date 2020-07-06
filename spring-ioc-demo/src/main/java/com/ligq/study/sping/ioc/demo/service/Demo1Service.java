package com.ligq.study.sping.ioc.demo.service;

import com.ligq.study.sping.ioc.demo.config.IocDemoBeanFactoryPostProcessor2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Demo1Service {

//    private IocDemoBeanFactoryPostProcessor2 iocDemoBeanFactoryPostProcessor2;
//
    public Demo1Service(){}


//    @Autowired
//    public Demo1Service(IocDemoBeanFactoryPostProcessor2 ioc){
//        log.info("IocDemoBeanFactoryPostProcessor2 ioc ");
//    }



    public void demo() {
        log.info("Demo1Service demo");
    }
}
