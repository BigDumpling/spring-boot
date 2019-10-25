package com.ligq.study.jackson.demo.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;

@Data
public class TypeIdBean {
    private int id;

    @JsonTypeId
    private String name;
}
