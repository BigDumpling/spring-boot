package com.ligq.study.jackson.demo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import java.util.List;

/**
 * 递归序列化问题解决方法： @JsonIdentityInfo
 */
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class User2 {
    private int id;
    private String name;
    private List<Item2> userItems;

    public void addItem(Item2 item) {
        userItems.add(item);
    }
}
