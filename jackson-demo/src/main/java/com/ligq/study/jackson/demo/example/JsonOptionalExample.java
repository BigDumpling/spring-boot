package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.ligq.study.jackson.demo.model.Book;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
public class JsonOptionalExample {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Jdk8Module());

        Book book = new Book();
        book.setTitle("Oliver Twist");
        book.setSubTitle(Optional.of("The Parish Boy's Progress"));
        String jsonStr = objectMapper.writeValueAsString(book);
        log.info("jsonStr == {}", jsonStr);


        book.setSubTitle(Optional.empty());
        String jsonStr2 = objectMapper.writeValueAsString(book);
        log.info("jsonStr2 == {}", jsonStr2);

        String str = "{\"title\":\"Oliver Twist\",\"subTitle\":\"present\"}";
        Book book1 = objectMapper.readValue(str, Book.class);
        log.info("book1 == {}", book1);
    }
}
