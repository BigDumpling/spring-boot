package com.ligq.study.spring.demo;

import com.ligq.study.spring.demo.control.HelloWorldController;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HelloWorldControllerTest {

    @Autowired
    private HelloWorldController helloWorldController;

    @Test
    public void helloTest(){
        helloWorldController.hello();
    }
}
