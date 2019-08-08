package com.ligq.study.spring.demo;

import com.ligq.study.spring.demo.proxy.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Test
    public void aspectTest() {
        userService.add("ligq");
        log.info("flag == {}", userService.getFlag());
    }
}
