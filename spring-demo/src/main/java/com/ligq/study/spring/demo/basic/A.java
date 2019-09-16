package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class A {
    private int num = 0;

    public void add(int step) {
        log.info(" ----- add ----- ");
        num = num + step;
    }

    public void multi(int step) {
        log.info(" ----- multi ----- ");
        num = num * step;
    }

    public void devide(int step) {
        log.info(" ----- devide ----- ");
        num = num / step;
    }
}
