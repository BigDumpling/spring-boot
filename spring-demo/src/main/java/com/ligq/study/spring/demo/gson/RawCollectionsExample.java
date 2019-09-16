package com.ligq.study.spring.demo.gson;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collection;

@Slf4j
public class RawCollectionsExample {
    static class Event {
        private String name;
        private String source;

        private Event(String name, String source) {
            this.name = name;
            this.source = source;
        }

        @Override
        public String toString() {
            return String.format("(name = %s, source = %s)", name, source);
        }
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        Collection collection = new ArrayList();
        collection.add("hello");
        collection.add(5);
        collection.add(new Event("ligq", "hahah"));

        String json = gson.toJson(collection);
        log.info("json == {}", json);

        JsonParser parser = new JsonParser();
        JsonArray array = parser.parse(json).getAsJsonArray();
        String message = gson.fromJson(array.get(0), String.class);
        int num = gson.fromJson(array.get(1), Integer.class);
        Event event = gson.fromJson(array.get(2), Event.class);
        log.info("message == {}, num == {}, event == {}", message, num, event);
    }
}
