package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

@Slf4j
public class JsonNodeExample {

    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("D:\\study\\spring-boot\\jackson-demo\\src\\main\\resources\\employee.txt"));
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(bytes);
        JsonNode id = jsonNode.get("id");
        log.info("id == {}", id.asInt());

        JsonNode phoneNoNode = jsonNode.get("phoneNumbers");
        Iterator<JsonNode> elements = phoneNoNode.iterator();
        if(elements.hasNext()){
            JsonNode phone = elements.next();
            log.info("phoneNo == {}", phone.asText());
        }

        ((ObjectNode)jsonNode).put("id", "500");
        ((ObjectNode)jsonNode).remove("name");
        objectMapper.writeValue(new File("D:\\study\\spring-boot\\jackson-demo\\src\\main\\resources\\employee-update.txt"), jsonNode);
    }
}
