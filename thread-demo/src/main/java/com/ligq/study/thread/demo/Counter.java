package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class Counter {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private int i = 0;

    public static void main(String[] args) {
        final Counter counter = new Counter();
        List<Thread> threads = new ArrayList<>(10000);
        for (int i=0;i<=10000;i++){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    counter.safeCount();
                    counter.count();
                }
            });
            threads.add(t);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        threads.forEach(f -> {
            try {
                f.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        log.info("i == {}", counter.i);
        log.info("atomicInteger == {}", counter.atomicInteger.get());

    }

    private void safeCount() {
        for (; ; ) {
            int i = atomicInteger.get();
            if (atomicInteger.compareAndSet(i, i + 1)) {
                break;
            }
        }
    }

    private void count() {
        ++i;
    }
}
