package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
public class SafeLazyInitialization {
    private static SafeLazyInitialization instance;

    public synchronized SafeLazyInitialization getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SafeLazyInitialization();
        }

        return instance;
    }
}
