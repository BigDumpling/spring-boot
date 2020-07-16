package com.ligq.study.mybatis.demo.service;

import com.ligq.study.mybatis.demo.model.Pet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BaseService1 extends AbstractBase {

    @Override
    protected int customeInsert(Pet pet) {
        int result = petMapper.insertSelective(pet);
        log.info("result == {}", result);
        return result;
    }
}
