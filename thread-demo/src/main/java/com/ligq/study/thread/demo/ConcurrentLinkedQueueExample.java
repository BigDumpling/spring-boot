package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentLinkedQueue;

@Slf4j
public class ConcurrentLinkedQueueExample {

    public static void main(String[] args){
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("name");
        queue.add("age");
        queue.add("male");

        log.info("queue == {}", queue);

        String first = queue.poll();
        String second = queue.poll();
        String third = queue.poll();

        log.info("first == {}", first);
        log.info("second == {}", second);
        log.info("third == {}", third);
    }
}
