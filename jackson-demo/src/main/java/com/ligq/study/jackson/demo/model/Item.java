package com.ligq.study.jackson.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

/**
 * 递归序列话解决方法： @JsonManagedReference（序列化）
 */
@Data
public class Item {
    private int id;
    private String itemName;

    @JsonManagedReference
    private User owner;
}
