package com.ligq.study.spring.demo.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StaticProxyTest {
    public static void main(String[] args){
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceStaticProxy proxy = new UserServiceStaticProxy(userService);
        proxy.add("liguoqiang");
    }
}
