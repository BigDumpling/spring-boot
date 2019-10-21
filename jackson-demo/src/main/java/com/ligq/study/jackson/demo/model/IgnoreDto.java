package com.ligq.study.jackson.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.Data;

@Data
@JsonIgnoreType
public class IgnoreDto {
    private String name;
    private int age;
    private boolean isMale;
}
