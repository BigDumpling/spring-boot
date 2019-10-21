package com.ligq.study.jackson.demo.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.ligq.study.jackson.demo.model.IgnoreDto;
import com.ligq.study.jackson.demo.model.IgnoreTypeDto;
import com.ligq.study.jackson.demo.model.MyDto;
import com.ligq.study.jackson.demo.model.MyDtoWithFilter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonIgnoreExample {

    /**
     * 忽略属性的方法：
     *  1. 类上添加 @JsonIgnoreProperties 注解
     *  2. 属性上添加 @JsonIgnore 注解
     *  3. 类上添加 @JsonIgnoreProperties 注解，且 addMixIn
     *  4. 使用过滤器 @JsonFilter
     */

    /**
     *
     * @param args
     * @throws JsonProcessingException
     */
    public static void main(String[] args) throws JsonProcessingException {
        MyDto dto = new MyDto();
        dto.setStringValue("name");
        dto.setIntValue(24);
        dto.setBooleanValue(false);
        ObjectMapper objectMapper = new ObjectMapper();
        String dtoStr = objectMapper.writeValueAsString(dto);
        log.info("dtoStr == {}", dtoStr);

        objectMapper.addMixIn(String.class, IgnoreDto.class);
        IgnoreDto ignoreDto = new IgnoreDto();
        ignoreDto.setName("ligq");
        ignoreDto.setAge(24);
        ignoreDto.setMale(true);

        IgnoreTypeDto ignoreTypeDto = new IgnoreTypeDto();
        ignoreTypeDto.setDto(ignoreDto);
        ignoreTypeDto.setAddress("上海市");
        String ignoreTypeDtoStr = objectMapper.writeValueAsString(ignoreTypeDto);
        log.info("ignoreTypeDtoStr == {}", ignoreTypeDtoStr);

        MyDtoWithFilter dtoObject = new MyDtoWithFilter();
        dtoObject.setAge(24);
        dtoObject.setName("name");
        dtoObject.setMale(true);
        SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.serializeAllExcept("name");
        FilterProvider filters = new SimpleFilterProvider().addFilter("myDtoFilter", simpleBeanPropertyFilter);
        String dtoObjectStr = objectMapper.writer(filters).writeValueAsString(dtoObject);
        log.info("dtoObjectStr == {}", dtoObjectStr);
    }
}
