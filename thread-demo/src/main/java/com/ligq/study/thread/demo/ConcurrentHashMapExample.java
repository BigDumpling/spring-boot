package com.ligq.study.thread.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class ConcurrentHashMapExample {

    public static void main(String[] args){
        ConcurrentHashMap map1 = new ConcurrentHashMap(4);
        ConcurrentHashMap map2 = new ConcurrentHashMap(4, 0.75f);
        log.info("map1: {}", map1);
        log.info("map2: {}", map2);
     }
}
