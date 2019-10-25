package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ligq.study.jackson.demo.model.NamingBean;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonNamingExample {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        NamingBean bean = new NamingBean();
        bean.setId(1);
        bean.setBeanName("beaningName");

        String json = objectMapper.writeValueAsString(bean);
        log.info("json == {}", json);
    }
}
