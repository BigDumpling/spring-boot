package com.ligq.study.jackson.demo.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.Data;

@JsonFilter("myDtoFilter")
@Data
public class MyDtoWithFilter {
    private String name;
    private int age;
    private boolean isMale;
}
