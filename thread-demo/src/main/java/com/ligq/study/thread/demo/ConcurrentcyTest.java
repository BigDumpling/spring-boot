package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcurrentcyTest {

    private static final int count = 10001;

    public static void main(String[] args) throws InterruptedException {
        concurrentcy();
        serial();
    }

    public static void concurrentcy() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (int i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.run();

        int b = 0;
        for (int i = count; i > 0; i--) {
            b--;
        }

        thread.join();
        long endTime = System.currentTimeMillis();
        log.info("concurrentcy spend time == {}", endTime - startTime);
    }

    public static void serial() {
        long startTime = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a += 5;
        }

        int b = 0;
        for (int i = count; i > 0; i--) {
            b--;
        }
        long endTime = System.currentTimeMillis();
        log.info("serial spend time == {}", endTime - startTime);
    }
}
