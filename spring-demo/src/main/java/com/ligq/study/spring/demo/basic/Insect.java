package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Insect {
    private int i = 9;
    protected int j;

    public Insect() {
        log.info("i == {}, j == {}", i, j);
        j = 39;
    }

    static int printInit(String s) {
        log.info("s == {}", s);
        return 47;
    }

    private static int x1 = printInit("static Insect.x1 initialized");
}
