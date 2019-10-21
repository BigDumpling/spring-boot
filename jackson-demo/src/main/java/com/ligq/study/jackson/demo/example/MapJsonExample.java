package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class MapJsonExample{

    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("D:\\study\\spring-boot\\jackson-demo\\src\\main\\resources\\map.txt"));
        Map<String, String> map = new HashMap<>(4);
        ObjectMapper objectMapper = new ObjectMapper();
        map = objectMapper.readValue(bytes, HashMap.class);
        log.info("map == {}", map);

        map = objectMapper.readValue(bytes, new TypeReference<Map<String, String>>() {});
        log.info("map == {}", map);
    }
}
