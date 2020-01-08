package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

@Slf4j
public class InterruptedExample {
    public static void main(String[] args) throws InterruptedException {
        Thread sleepThread = new Thread(new SleepThread(), "sleepThread");
        sleepThread.setDaemon(true);
        Thread busyThread = new Thread(new BusyThread(), "busyThread");
        sleepThread.setDaemon(true);
        sleepThread.start();
        busyThread.start();

        TimeUnit.SECONDS.sleep(3);
        sleepThread.interrupt();
        busyThread.interrupt();

        log.info("sleepThread interrupted == {}", sleepThread.isInterrupted());
        log.info("busyThread interrupted == {}", busyThread.isInterrupted());
        TimeUnit.SECONDS.sleep(1);
    }

    static class SleepThread implements Runnable {
        @Override
        public void run() {
            while (true){
                try {
                    log.info("----- SleepThread begin -----");
                    TimeUnit.SECONDS.sleep(10);
                    log.info("----- SleepThread end -----");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//            log.info("thread end");
        }
    }

    static class BusyThread implements Runnable {
        @Override
        public void run() {
            while (true) {
//                log.info("----- BusyThread -----");
            }
        }
    }

}
