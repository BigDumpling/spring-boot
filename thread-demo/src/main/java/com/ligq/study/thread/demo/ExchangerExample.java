package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class ExchangerExample {

    private final static Exchanger<String> exchanger = new Exchanger<>();
    private static ExecutorService executor = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                log.info("交换数据A");
                try {
                    String A = exchanger.exchange("交换数据A");
                    log.info("B == {}", A);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                log.info("交换数据B");
                try {
                    log.info("开始交换数据B");
                    String data = exchanger.exchange("交换数据B");
                    log.info("A == {}", data);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executor.shutdown();
    }
}
