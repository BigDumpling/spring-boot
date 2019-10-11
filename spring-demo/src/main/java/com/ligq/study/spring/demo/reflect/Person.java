package com.ligq.study.spring.demo.reflect;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Person {
    private String name;
    private int age;
    private String address;

    public Person(){

    }

    private Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    protected String print(){
        return "name: " + this.name + ", age: " + this.age + ", address: " + this.address;
    }
}
