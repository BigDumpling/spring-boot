package com.ligq.study.jackson.demo.model;

import lombok.Data;

@Data
public class IgnoreTypeDto {
    private IgnoreDto dto;
    private String address;
}
