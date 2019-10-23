package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ligq.study.jackson.demo.model.PropertyDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonPropertyExample {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        PropertyDto dto = new PropertyDto();
        dto.setName("li");
        dto.setMobile("131");

        String jsonStr = objectMapper.writeValueAsString(dto);
        log.info("jsonStr == {}", jsonStr);

        String jsonStr2 = "{\"name\":\"li\",\"mobile\":\"131\"}";
        PropertyDto dto1 = objectMapper.readValue(jsonStr2, PropertyDto.class);
        log.info("dto1 == {}", dto1);
    }
}
