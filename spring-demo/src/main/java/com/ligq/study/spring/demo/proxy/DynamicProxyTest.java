package com.ligq.study.spring.demo.proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.*;

@Slf4j
public class DynamicProxyTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        UserService userService = new UserServiceImpl2();
        UserServiceInvocationHandler proxy = new UserServiceInvocationHandler(userService);
        UserService proxyObject = (UserService) Proxy.newProxyInstance(DynamicProxyTest.class.getClassLoader(), new Class[]{UserService.class}, proxy);
        proxyObject.add("liguoqiang");

//        Class calculatorProxyClass = Proxy.getProxyClass(UserService.class.getClassLoader(), UserService.class);
//        Constructor constructor = calculatorProxyClass.getConstructor(InvocationHandler.class);
//        UserService userService1 = (UserService) constructor.newInstance(new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                log.info("before =====");
//                UserServiceImpl2 userService = new UserServiceImpl2();
//                method.invoke(userService, args);
//                log.info("after =====");
//                return null;
//            }
//        });
//
//        userService.add("");
    }
}
