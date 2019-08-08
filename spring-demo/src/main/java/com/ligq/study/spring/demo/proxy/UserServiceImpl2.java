package com.ligq.study.spring.demo.proxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("userService2")
public class UserServiceImpl2 implements UserService {

    @Override
    public void add(String name) {
        log.info("----- UserServiceImpl2.add() name == {} -----", name);
    }

    @Override
    public boolean getFlag() {
        return true;
    }

}
