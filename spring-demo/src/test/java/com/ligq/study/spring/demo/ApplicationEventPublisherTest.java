package com.ligq.study.spring.demo;

import com.ligq.study.spring.demo.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationEventPublisherTest {

    @Autowired
    private EmailService emailService;

    @Test
    public void sendEmailTest(){
        emailService.setBlackList(Arrays.asList("Smallqiang13@163.com", "ligq6@newhope.cn"));
        emailService.sendEmail("Smallqiang13@163.com", "Spring ApplicationEvent study");
    }
}
