package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Slf4j
public class CacheExample {

    private final static Map<String, Object> map = new HashMap<>();
    private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private static Lock read = lock.readLock();
    private static Lock write = lock.writeLock();

    public static Object getValue(String key) {
        read.lock();
        try {
            return map.get(key);
        } finally {
            read.unlock();
        }
    }

    public static Object putValue(String key, Object value) {
        write.lock();
        try {
            return map.put(key, value);
        } finally {
            write.unlock();
        }
    }
}
