package com.ligq.study.spring.ioc.demo;

import com.ligq.study.spring.ioc.demo.service.Demo1Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Demo1ServiceTest {

    @Autowired
    private Demo1Service demo1Service;

    @Test
    public void demoTest() {
        demo1Service.demo();
    }
}
