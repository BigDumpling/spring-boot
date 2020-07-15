package com.ligq.study.spring.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ligq.study.spring.demo.gson.ContractModel;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@Slf4j
@RunWith(BlockJUnit4ClassRunner.class)
public class CommonTest {

    @Test
    public void gsonSerializedNameTest() {
        Gson gson = new GsonBuilder().create();

        String json = "{\"contractIds\":\"1\",\"contractNos\":\"11\",\"contractFileIds\":\"111\",\"contractTemplateNames\":\"1111\"}";
        ContractModel model = gson.fromJson(json, ContractModel.class);
        log.info("model == {}", gson.toJson(model));

        String json2 = "{\"contractId\":\"1\",\"contractNo\":\"11\",\"contractFileId\":\"111\",\"contractTemplateName\":\"1111\"}";
        ContractModel model2 = gson.fromJson(json2, ContractModel.class);
        log.info("model2 == {}", gson.toJson(model2));
    }

    @Test
    public void nullTest(){
        Object o1 = null;
        Object o2 = null;

        log.info("o1 == o2 = {}", o1 == o2);
//        log.info("o1 equals o2 = {}", o1.equals(o2));
        log.info("o1 != o2 = {}", o1 != o2);

        Object o3 = null;
        Object o4 = "null";
        log.info("o3 == o3 = {}", o3 == o3);
        log.info("o3 != o3 = {}", o3 != o3);
        log.info("o4 == o4 = {}", o4 == o4);
        log.info("o4 != o4 = {}", o4 != o4);


    }
}
