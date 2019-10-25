package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ligq.study.jackson.demo.model.BeanBuilder;
import com.ligq.study.jackson.demo.model.POJOBuilderBean;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonPOJOBuilderExample {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        String jsonStr = "{\"id\":5,\"name\":\"POJO Builder Bean\"}";
        POJOBuilderBean builderBean = objectMapper.readValue(jsonStr, POJOBuilderBean.class);
//        BeanBuilder builderBean = objectMapper.readValue(jsonStr, BeanBuilder.class);
        log.info("builderBean == {}", builderBean);
    }
}
