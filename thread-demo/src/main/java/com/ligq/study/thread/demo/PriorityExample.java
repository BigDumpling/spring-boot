package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
public class PriorityExample {
    private static volatile boolean notStart = true;
    private static volatile boolean notEnd = true;

    public static void main(String[] args) throws InterruptedException {
        List<Job> jobs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int priority = i < 5 ? Thread.MIN_PRIORITY : Thread.MAX_PRIORITY;
            Job job = new Job(i);
            jobs.add(job);
            Thread thread = new Thread(job, "job" + i);
            thread.setPriority(priority);
            thread.start();
        }
        TimeUnit.MILLISECONDS.sleep(10);
        notStart = false;
        TimeUnit.MILLISECONDS.sleep(10);
        notEnd = false;

        TimeUnit.MINUTES.sleep(1);
        jobs.forEach(f -> {
            log.info("Job, priority == {}, jobCount == {}", f.priority, f.jobCount);
        });
    }

    public static class Job implements Runnable {
        private int priority;
        private long jobCount = 0L;

        public Job(int priority) {
            this.priority = priority;
        }

        @Override
        public void run() {
            while (notStart) {
                log.info("---------- priority=={} notStart ----------", priority);
                Thread.yield();
            }
            while (notEnd) {
                log.info("---------- priority=={} notEnd ----------", priority);
                Thread.yield();
                log.info("---------- priority=={} notEnd, jobCount == {} ----------", priority, jobCount);
                jobCount++;
            }
        }
    }
}
