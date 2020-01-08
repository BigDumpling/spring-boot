package com.ligq.study.spring.demo.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

@Slf4j
public class SpliteratorExample {

    public static void main(String[] args) {
        listSpliterator();
    }

    private static void listSpliterator() {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e");

        Spliterator<String> stringSpliterator = stringList.spliterator();
        log.info("stringSpliterator.characteristics == {}", stringSpliterator.characteristics());
        log.info("stringSpliterator.estimateSize == {}", stringSpliterator.estimateSize());
        log.info("stringSpliterator.getExactSizeIfKnown == {}", stringSpliterator.getExactSizeIfKnown());

//        stringSpliterator.forEachRemaining(f -> {
//            log.info("f == {}", f);
//        });

        Spliterator<String> spliterator2 = stringSpliterator.trySplit();
        spliterator2.forEachRemaining(f -> {
            log.info("f == {}", f);
        });
    }
}
