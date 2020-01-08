package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
public class SafeDoubleCheckLazyInitialization {
    private volatile static SafeDoubleCheckLazyInitialization instance;
    public static SafeDoubleCheckLazyInitialization getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (SafeDoubleCheckLazyInitialization.class) {
                instance = new SafeDoubleCheckLazyInitialization();
            }
        }
        return instance;
    }
}
