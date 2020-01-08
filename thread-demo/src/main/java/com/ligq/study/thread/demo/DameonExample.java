package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class DameonExample {

    public static void main(String[] args){
        Thread thread = new Thread(new DameonRunner(), "Thread-dameon");
        thread.setDaemon(true);
        thread.start();
        log.info("main end");
    }

    public static class DameonRunner implements Runnable{
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(10);
                log.info("sleep end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                log.info("DameonRunner stop");
            }
        }
    }
}
