package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        log.info("k == {}", k);
        log.info("j == {}", j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        log.info("Beetle Constructor");
        Beetle b = new Beetle();
    }
}
