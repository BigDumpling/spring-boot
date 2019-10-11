package com.ligq.study.spring.demo.gson.gson2;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonGson2 {
    public static void main(String[] args){
//        BagOfPrimitives obj = new BagOfPrimitives();
//        Gson gson = new Gson();
//        String json = gson.toJson(obj);
//        log.info("json == {}", json);
//
//        BagOfPrimitives ofPrimitives = gson.fromJson(json, BagOfPrimitives.class);
//        log.info("ofPrimitives == {}", ofPrimitives);

        String json = "{\"b\":\"abc\"}";
        Gson gson = new Gson();
        A a = new A();
        A.B b = a.new B();
        b = gson.fromJson(json, A.B.class);
        log.info("b == {}", b);

        A a2 = new A();
        a2.setA("AAA");
        A.B b2 = a2.new B();
        b2.setB("BBB");
        a2.setB(b2);
        String json2 = gson.toJson(a2);
        log.info("json2 == {}", json2);
    }
}
