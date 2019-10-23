package com.ligq.study.jackson.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class NotNullDto {
    private String name;
    private Integer age;
    private Boolean isMale;
}
