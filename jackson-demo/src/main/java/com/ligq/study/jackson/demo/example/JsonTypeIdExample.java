package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.ligq.study.jackson.demo.model.TypeIdBean;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonTypeIdExample {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.activateDefaultTyping(new PolymorphicTypeValidator.Base() {}, ObjectMapper.DefaultTyping.NON_FINAL);

        TypeIdBean bean = new TypeIdBean();
        bean.setId(6);
        bean.setName("Type Id Bean");
        String jsonStr = objectMapper.writeValueAsString(bean);
        log.info("jsonStr == {}", jsonStr);
    }
}
