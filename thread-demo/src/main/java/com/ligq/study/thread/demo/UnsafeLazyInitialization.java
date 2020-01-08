package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

@Slf4j
public class UnsafeLazyInitialization {

    private static UnsafeLazyInitialization instance;

    public static UnsafeLazyInitialization getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UnsafeLazyInitialization();
        }

        return instance;
    }
}
