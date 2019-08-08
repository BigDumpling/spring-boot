package com.ligq.study.spring.demo.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * JDK动态代理
 */
@Slf4j
public class UserServiceInvocationHandler implements InvocationHandler {

    private Object target;

    public UserServiceInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("------------------ dynamic proxy before process -------------------");
        log.info("------------------ dynamic proxy, args == {}", args);
        Object value = method.invoke(target, args);
        log.info("------------------ dynamic proxy after process, value == {} -------------------", value);
        return value;
    }
}
