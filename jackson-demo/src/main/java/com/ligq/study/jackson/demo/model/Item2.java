package com.ligq.study.jackson.demo.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

/**
 * 递归序列化问题解决方法： @JsonIdentityInfo
 */
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
public class Item2 {
    private int id;
    private String itemName;
    private User2 owner;
}
