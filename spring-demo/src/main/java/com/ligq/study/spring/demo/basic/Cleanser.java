package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cleanser {
    private String s = "Cleanser";

    public void append(String a){
        log.info("Cleanser append()");
        s += a;
    }

    private void apply(){
        log.info("Cleanser apply()");
        append(" apply()");
    }

    @Override
    public String toString(){
        return "Cleanser";
    }
}
