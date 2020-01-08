package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InstanceFactory {

    private static class InstanceHolder {
        public static Counter counter = new Counter();
    }

    public static Counter getInstance() {
        return InstanceHolder.counter;
    }
}
