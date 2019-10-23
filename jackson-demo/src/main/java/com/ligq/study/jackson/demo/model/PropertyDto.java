package com.ligq.study.jackson.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PropertyDto {
    private String name;

    @JsonProperty(value = "phone")
    private String mobile;
}
