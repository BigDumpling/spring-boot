package com.ligq.study.spring.demo.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Lazy
public class FatherClass {

    private final static Logger logger = LoggerFactory.getLogger(FatherClass.class);

    @PostConstruct
    public void initTest(){
        logger.info("{} FatherClass init", this);
    }
}
