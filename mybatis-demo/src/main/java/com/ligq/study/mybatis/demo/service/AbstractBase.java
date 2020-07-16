package com.ligq.study.mybatis.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ligq.study.mybatis.demo.dao.PetMapper;
import com.ligq.study.mybatis.demo.model.Pet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Slf4j
public abstract class AbstractBase {

    @Autowired
    protected ObjectMapper objectMapper;
    @Autowired
    protected PetMapper petMapper;

    protected abstract int customeInsert(Pet pet);

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insert(Object o) throws JsonProcessingException {
        Pet pet = new Pet();
        pet.setName("大公鸡");
        pet.setSex("1");
        pet.setOwner("小强");
        pet.setCreateTime(LocalDateTime.now());
        pet.setCreateTimestamp(LocalDateTime.now());

        log.info("pet == {}", objectMapper.writeValueAsString(pet));
        int result = customeInsert(pet);
        log.info("result == {}", result);
        return result;
    }
}
