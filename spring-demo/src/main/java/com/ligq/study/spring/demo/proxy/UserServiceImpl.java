package com.ligq.study.spring.demo.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public void add(String name) {
        log.info("------------- UserServiceImpl.add() --------------------, name == {}", name);
    }

    @Override
    public boolean getFlag() {
//        throw new RuntimeException("---------- UserServiceImpl.getFlag(), exception test -----------");
        return false;
    }
}
