package com.ligq.study.spring.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class HelloSmartLifeCycle implements SmartLifecycle, InitializingBean {

    @PostConstruct
    public void initInstance(){
        log.info("---------- HelloSmartLifeCycle initInstance() ------------------");
    }

    private volatile boolean running = false;

    public HelloSmartLifeCycle(){
        log.info("-------------------------HelloSmartLifeCycle 构造方法");
    }

    @Override
    public void start() {
        log.info("------------------------SmartLifecycle start()");
        if(!isRunning()){
            running = true;
        }
    }

    @Override
    public void stop() {
        log.info("-----------------------------------SmartLifecycle stop()");
        if(isRunning()){
            running = false;
        }
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("-----------------------------------HelloSmartLifeCycle init() -------------------------");
    }

//    @Override
//    public int getPhase() {
//        return -1;
//    }
}
