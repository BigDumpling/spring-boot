package com.ligq.study.rocketmq.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RunWith(BlockJUnit4ClassRunner.class)
public class RebalanceTest {

    @Test
    public void averageByCircleTest(){
        String currentCID = "B";
        List<String> cidAll = Arrays.asList("A", "B", "C", "D");
        List<String> mqAll = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24");

        List<String> result = new ArrayList<String>();
        int index = cidAll.indexOf(currentCID);
        for (int i = index; i < mqAll.size(); i++) {
            if (i % cidAll.size() == index) {
                result.add(mqAll.get(i));
            }
        }

        log.info("result == {}", result);
    }
}
