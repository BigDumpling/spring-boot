package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
public class DoubleCheckLazyInitialization {

    private static DoubleCheckLazyInitialization instance;

    public static DoubleCheckLazyInitialization getInstance(){
        if(Objects.isNull(instance)){
            synchronized (DoubleCheckLazyInitialization.class){
                if(Objects.isNull(instance)){
                    instance = new DoubleCheckLazyInitialization();
                }
            }
        }

        return instance;
    }
}
