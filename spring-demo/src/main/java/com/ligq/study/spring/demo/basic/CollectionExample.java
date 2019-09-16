package com.ligq.study.spring.demo.basic;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Collection;

@Slf4j
public class CollectionExample {

    public static void main(String[] args) {
        listToArray();
    }

    public static void listToArray() {
        Collection<Cleanser> list = Arrays.asList(new Cleanser(), new Cleanser());
        Detergent[] arrays = list.toArray(new Detergent[0]);
        log.info("arrays == {}", arrays);
    }
}
