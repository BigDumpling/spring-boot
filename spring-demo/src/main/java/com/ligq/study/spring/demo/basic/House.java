package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class House {
    Window w1 = new Window(1);

    House() {
        log.info("House()");
    }

    void f() {
        log.info("f()");
    }

    Window w2 = new Window(2);
    static Window w3 = new Window(3);

    static {
        log.info("static{}");
    }

    static Window w4 = new Window(4);
}
