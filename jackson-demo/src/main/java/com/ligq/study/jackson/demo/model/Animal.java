package com.ligq.study.jackson.demo.model;

public abstract class Animal {
    public String name;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
