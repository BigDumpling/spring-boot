package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Base {
    public Base(int i) {
      log.info("Base constructor.i == {}", i);
    }

    public void r(){
        log.info("Base.r()");
    }

    public abstract void f();
}
