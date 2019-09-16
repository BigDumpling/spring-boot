package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demotion {

    static void f1(long l){
        log.info("long == {}", l);
    }

    public static void main(String[] args){
        int i = 100;
        f1(100);
    }
}
