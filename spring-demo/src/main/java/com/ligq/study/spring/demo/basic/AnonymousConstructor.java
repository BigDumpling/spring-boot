package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {

            { log.info("Inside instance initializer"); super.r();}

            @Override
            public void f() {
                log.info("In anonymousConstructor f()");
            }
        };
    }

    public static void main(String[] args){
        Base base = getBase(47);
        base.f();
    }
}
