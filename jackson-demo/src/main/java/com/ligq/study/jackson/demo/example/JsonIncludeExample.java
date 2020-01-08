package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ligq.study.jackson.demo.model.NotNullDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonIncludeExample {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        objectMapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);

        NotNullDto dto = new NotNullDto();
        String jsonStr = objectMapper.writeValueAsString(dto);
        log.info("jsonStr == {}", jsonStr);

        dto.setName("li");
        String jsonStr2 = objectMapper.writeValueAsString(dto);
        log.info("jsonStr2 == {}", jsonStr2);

    }
}
