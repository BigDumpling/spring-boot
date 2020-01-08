package com.ligq.study.spring.demo.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class MapExample {

    public static void main(String[] args){
        setValue();
    }

    private static void setValue(){
        Object object = new Object();
        log.info("object == {}", object);

        Map<String, Object> map = new HashMap<>(4);
        map.put("age", 12);
        map.put("name", "li");
        Object result1 = map.put("member", object);
        log.info("result1 == {}", result1);
        log.info("map == {}", map);

        Object object2 = new Object();
        log.info("object2 == {}", object2);
        Object result2 = map.put("member", object2);
        log.info("result2 == {}", result2);
    }
}
