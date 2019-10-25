package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ligq.study.jackson.demo.model.*;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * 递归序列化问题：
 * 1. @JsonManagedReference 与 @JsonBackReference
 * 2. @JsonIdentityInfo
 * 3. @JsonIgnore 忽略关系的某一方
 * 4. @JsonView 定义 public 和 private 两种view
 * 5. 自定义序列化与反序列化
 */
@Slf4j
public class JsonBidirectionExample {

    public static void main(String[] args) throws JsonProcessingException {
        User user = new User();
        user.setId(1);
        user.setName("John");
        user.setUserItems(new ArrayList<>());

        Item item = new Item();
        item.setId(2);
        item.setItemName("book");
        item.setOwner(user);

        user.addItem(item);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(item);
        log.info("json == {}", json);

        User2 user2 = new User2();
        user2.setId(1);
        user2.setName("John");
        user2.setUserItems(new ArrayList<>());

        Item2 item2 = new Item2();
        item2.setId(2);
        item2.setItemName("book");
        item2.setOwner(user2);

        user2.addItem(item2);
        String json2 = objectMapper.writeValueAsString(user2);
        String json3 = objectMapper.writeValueAsString(item2);
        log.info("json2 == {}", json2);
        log.info("json3 == {}", json3);

        UserWithIdentityReference userWithIdentityReference = new UserWithIdentityReference();
        userWithIdentityReference.setId(3);
        userWithIdentityReference.setName("Bean With Identity Reference Annotation");

        UserWithoutIdentityReference userWithoutIdentityReference = new UserWithoutIdentityReference();
        userWithoutIdentityReference.setId(4);
        userWithoutIdentityReference.setName("Bean Without Identity Reference Annotation");

        String json4 = objectMapper.writeValueAsString(userWithIdentityReference);
        String json5 = objectMapper.writeValueAsString(userWithoutIdentityReference);
        log.info("json4 == {}", json4);
        log.info("json5 == {}", json5);
    }
}
