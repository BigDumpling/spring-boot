package com.ligq.study.jackson.demo.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.IntNode;
import com.ligq.study.jackson.demo.model.Item;

import java.io.IOException;

public class ItemDeserializer extends StdDeserializer<Item> {

    public ItemDeserializer(){
        this(null);
    }

    protected ItemDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Item deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = p.getCodec().readTree(p);
        int id = (Integer) node.get("id").numberValue();
        String itemName = node.get("itemName").asText();
        int userId = (Integer) node.get("createdBy").numberValue();

        Item item = new Item();
        item.setId(id);
        item.setItemName(itemName);
        return item;
    }
}
