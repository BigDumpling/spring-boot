package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ligq.study.jackson.demo.model.Zoo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonMappingExceptionExample {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        String json = "{\"animal\":{\"name\":\"lacy\"}}";
        Zoo zoo = objectMapper.reader().forType(Zoo.class).readValue(json);
        log.info("zoo == {}", zoo);
    }
}
