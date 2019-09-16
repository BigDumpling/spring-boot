package com.ligq.study.spring.demo.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Slf4j
public class DateTimeSerializer implements JsonSerializer<LocalDateTime> {
    @Override
    public JsonElement serialize(LocalDateTime localDateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        log.info("localDateTime == {}", localDateTime);
        log.info("type == {}", type.getTypeName());
        JsonObject obj = new JsonObject();
        obj.addProperty("date", localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " -- custom serializer");
        obj.addProperty("time", localDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + " -- custom serializer");
        return obj;
    }
}
