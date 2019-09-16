package com.ligq.study.spring.demo.gson;

public class BagOfPrimitives {

    private int value1 = 1;
    private String value2 = "abc";
    private transient int value = 3;

    public BagOfPrimitives() {
    }

     class BagOfPrimitivesInner {
        public String b = "name";

        public BagOfPrimitivesInner() {
        }
    }
}
