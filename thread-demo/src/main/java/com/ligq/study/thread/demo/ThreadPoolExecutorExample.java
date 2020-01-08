package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class ThreadPoolExecutorExample {

    public static void main(String[] args){
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,5, TimeUnit.SECONDS,new LinkedBlockingQueue<>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        executor.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
