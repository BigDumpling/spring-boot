package com.ligq.study.spring.demo.reflect;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class CommonReflect {

    public static void main(String[] args){
//        Class objClass = Object.class;
//        String str1 = objClass.toGenericString();
//        log.info("str1 == {}", str1);
//
//        Class personClass = Person.class;
//        String str2 = objClass.toGenericString();
//        log.info("str2 == {}", str2);

        Person p = new AsiaPerson();
        Person p2 = new Person();
        log.info("getClass == {}", p.getClass().toString());
        log.info("getSuperclass == {}", p.getClass().getSuperclass().toString());
        log.info("getSuperclass == {}", p2.getClass().getSuperclass().toString());
        log.info("p getTypeParameters == {}", Arrays.stream(p.getClass().getTypeParameters()).map(m -> {return m.getName() + ","; }));
        log.info("p2 getTypeParameters == {}", p2.getClass().getTypeParameters().toString());

    }
}
