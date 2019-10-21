package com.ligq.study.jackson.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(value = "stringValue")
public class MyDto {
    private String stringValue;

    @JsonIgnore
    private int intValue;
    private boolean booleanValue;
}
