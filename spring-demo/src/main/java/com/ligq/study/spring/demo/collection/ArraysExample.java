package com.ligq.study.spring.demo.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class ArraysExample {

    public static void main(String[] args){
        getFirst();
    }

    private static void copyOf(){
        String[] stringArray = new String[]{"li", "guo"};
        String[] copyResult = Arrays.copyOf(stringArray, 1, String[].class);

        log.info("stringArray.length == {}", stringArray.length);
        log.info("copyResult.length == {}", copyResult.length);
    }

    private static void toArray(){
        List<String> list = new ArrayList<>(5);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Object[] stringArray = new Object[5];
        list.toArray(stringArray);
        for (Object s : stringArray){
            log.info("s == {}", s);
        }
    }

    private static void retainAll(){
        List<String> list1 = new ArrayList<>(2);
        list1.add("li");
        list1.add("175");
        list1.add("male");
        list1.add("shanghai");

        List<String> list2 = new ArrayList<>(2);
        list2.add("male");
        list2.add("shanghai");

        boolean retainAll = list1.retainAll(list2);

        log.info("retainAll == {}", retainAll);
        log.info("list1.size() == {}", list1.size());
        log.info("list2.size() == {}", list2.size());
    }

    private static void getFirst(){
        LinkedList<String> list = new LinkedList<>();
        String first = list.getFirst();
        log.info("first == {}", first);
    }
}
