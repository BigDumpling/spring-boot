package com.ligq.study.spring.demo;

import com.ligq.study.spring.demo.control.CommandManager;
import com.ligq.study.spring.demo.control.CommandManagerLookUp;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CommandManagerTest {

    @Autowired
    private CommandManager commandManager;
    @Autowired
    private CommandManagerLookUp commandManagerLookUp;

    @Test
    public void singletonTest() {
        log.info("address1 == {}", commandManager.process());
        log.info("address2 == {}", commandManager.process());
    }

    @Test
    public void singletonTest2() {
        log.info("address1 == {}", commandManagerLookUp.process());
        log.info("address2 == {}", commandManagerLookUp.process());
    }
}
