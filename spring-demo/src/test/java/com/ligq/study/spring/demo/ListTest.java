package com.ligq.study.spring.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ListTest {

    private static Logger logger = LoggerFactory.getLogger(ListTest.class);

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(3);
        list.add(new Person("ligq1", 24, "ha"));
        list.add(new Person("ligq2", 25, "haha"));
        list.add(new Person("ligq3", 26, "hahaha"));
        logger.info("list == {}", list);
        List<Person> list2 = buildList(list);
        logger.info("build list2 == {}", list2);
    }

    private static List buildList(List<Person> list) {
        List<Person> list2 = list.stream()
                .map(m -> {
                    Person p = new Person();
                    p.setName(m.getName() + "--build");
                    p.setAge(m.getAge() + 2);
                    p.setDescribe(m.getDescribe() + "--build");
                    return p;
                })
                .collect(toList());
        return list2;
    }

    static class Person {
        private String name;
        private int age;
        private String describe;

        public Person() {
        }

        public Person(String name, int age, String describe) {
            this.name = name;
            this.age = age;
            this.describe = describe;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }
    }
}
