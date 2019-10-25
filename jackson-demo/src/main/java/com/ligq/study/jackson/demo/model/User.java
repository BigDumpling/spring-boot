package com.ligq.study.jackson.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import java.util.List;

/**
 * 递归序列化报错解决方法： @JsonBackReference（不序列化）
 */
@Data
public class User {
    private int id;
    private String name;

    @JsonBackReference
    private List<Item> userItems;

    public void addItem(Item item) {
        userItems.add(item);
    }
}
