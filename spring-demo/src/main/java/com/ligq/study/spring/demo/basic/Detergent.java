package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Detergent extends Cleanser {
    private String s = "Detergent";
    public String s_public = "Detergent_public";

    public void scrub(){
        log.info("Detergent scrub");
    }
    private void apply(){
      log.info("Detergent apply()");
    }

    @Override
    public void append(String a){
        log.info("Detergent append()");
    }

    @Override
    public String toString(){
        return "Detergent";
    }
}
