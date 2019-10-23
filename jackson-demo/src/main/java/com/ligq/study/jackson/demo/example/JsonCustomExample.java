package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.ligq.study.jackson.demo.deserializer.ItemDeserializer;
import com.ligq.study.jackson.demo.model.Item;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonCustomExample {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

//        String json = "\"id\": 1,\"itemName\": \"theItem\",\"createdBy\": 2";
//        Item item = objectMapper.readValue(json, Item.class);

        SimpleModule module = new SimpleModule();
        module.addDeserializer(Item.class, new ItemDeserializer());
        objectMapper.registerModule(module);
    }
}
