package com.ligq.study.spring.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

/**
 * Lifecycle定义了Spring容器对象的生命回调，任何Spring管理对象都可以实现该接口。
 * 当ApplicationContext本身接收到启动/停止信号时，Spring容器将在容器上下文中找出所有实现了Lifecycle及其子类接口的类，并一一调用它们实现的类。
 * Spring是委托给了生命周期处理器LifecycleProcessor实现
 * 生命周期，当容器ApplicationContext显示的调用start()/stop()方法时，会回调LifeCycle的start与stop逻辑
 */
@Slf4j
@Component
public class HelloLifeCycle implements Lifecycle {
    private volatile boolean running = false;

    public HelloLifeCycle() {
        log.info("---------------------HelloLifecycle 构造方法");
    }

    @Override
    public void start() {
      log.info("----------------------------Lifecycle start()");
      if(!isRunning()){
          running = true;
      }
    }

    @Override
    public void stop() {
        log.info("---------------------Lifecycle stop()");
        if(isRunning()){
            running = false;
        }
    }

    @Override
    public boolean isRunning() {
        return running;
    }
}
