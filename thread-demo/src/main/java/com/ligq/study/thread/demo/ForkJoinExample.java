package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

@Slf4j
public class ForkJoinExample extends RecursiveTask<Integer> {

    private final static int THRESHOLD = 2;
    private int start;
    private int end;

    public ForkJoinExample(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinExample task = new ForkJoinExample(1, 4);
        Future<Integer> future = pool.submit(task);
        if (task.isCompletedAbnormally()) {
            log.info("error1 == {}", task.getException());
        }
        try {
            Integer sum = future.get();
            if (task.isCompletedAbnormally()) {
                log.info("error2 == {}", task.getException());
            }
            log.info("sum == {}", sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        Integer sum2 = pool.invoke(new ForkJoinExample(1, 4));
        log.info("sum2 == {}", sum2);

    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if ((end - start) <= THRESHOLD) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            ForkJoinExample leftTask = new ForkJoinExample(start, start + THRESHOLD);
            ForkJoinExample rightTask = new ForkJoinExample(start + THRESHOLD + 1, end);
            leftTask.fork();
            rightTask.fork();

            int leftResult = leftTask.join();
            int rightResult = rightTask.join();
            log.info("leftResult == {}, rightResult == {}", leftResult, rightResult);
            sum = leftResult + rightResult;
            throw new RuntimeException("test error");
        }

        return sum;
    }
}
