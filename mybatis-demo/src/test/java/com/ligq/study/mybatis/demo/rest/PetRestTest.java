package com.ligq.study.mybatis.demo.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PetRestTest {

    @Autowired
    private PetRest petRest;

    @Test
    public void getPetTest() throws JsonProcessingException {
        petRest.getPet();
    }

    @Test
    public void getPetTest2() throws JsonProcessingException {
        petRest.getPet2();
    }

}
