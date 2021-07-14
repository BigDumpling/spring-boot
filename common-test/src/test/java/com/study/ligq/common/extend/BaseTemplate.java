package com.study.ligq.common.extend;

public abstract class BaseTemplate {

    protected abstract String getName();

    protected int getAge(){
        return 0;
    }

    protected void print(String name, int age){
        System.out.println("name == " + name);
        System.out.println("\n");
        System.out.println("age == " + age);
    }

    public void execute(){
        String name = getName();
        int age = getAge();
        print(name, age);
    }
}
