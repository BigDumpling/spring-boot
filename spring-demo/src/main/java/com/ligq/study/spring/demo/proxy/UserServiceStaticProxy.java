package com.ligq.study.spring.demo.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 静态代理
 */
@Slf4j
public class UserServiceStaticProxy implements UserService {
    private UserService userService;

    public UserServiceStaticProxy(UserService userService) {
        this.userService = userService;
    }


    @Override
    public void add(String name) {
        log.info("---------- static proxy before process ----------");
        userService.add(name);
        log.info("---------- static proxy after process ----------");
    }

    @Override
    public boolean getFlag() {
        return false;
    }
}
