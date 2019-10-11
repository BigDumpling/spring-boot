package com.ligq.study.spring.demo.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Slf4j
public class GsonExample {
    public static void main(String[] args){
//        Gson gson = new Gson();
//        BagOfPrimitives obj = new BagOfPrimitives();
//        BagOfPrimitives.BagOfPrimitivesInner objInner = obj.new BagOfPrimitivesInner();
//        log.info("gson == {}", gson.toJson(objInner));

//        Collection<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
//        String json = gson.toJson(ints);
//        log.info("json == {}", json);
//
//        Type collectionType = new TypeToken<Collection<Integer>>(){}.getType();
//        Collection<Integer> list2 = gson.fromJson(json, collectionType);
//        log.info("list2 == {}", list2);

        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new DateTimeSerializer()).create();
        LocalDateTime localDateTime = LocalDateTime.now();
        String json = gson.toJson(localDateTime);
        log.info("dateTime json == {}", json);

//        Gson gson = new GsonBuilder().create();
//        Money money = new Money("10000", "人民币");
//        String json = gson.toJson(money);
//        log.info("json == {}", json);
//
//        Money money1 = gson.fromJson(json, Money.class);
//        log.info("money1 == {}", money1);
    }
}
