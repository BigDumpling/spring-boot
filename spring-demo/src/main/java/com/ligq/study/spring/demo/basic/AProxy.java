package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AProxy {

    private A a;

    public AProxy(A a) {
        this.a = a;
    }

    public void add(int step) {
        a.add(step);
    }

    public void multi(int step) {
        a.multi(step);
    }

    public void devide(int step) {
        a.devide(step);
    }
}
