package com.ligq.study.spring.demo.fastjson;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FastjsonExample {

    public static void main(String[] args){
        method1();
    }

    private static void method1(){
        Group group = new Group();
        group.setId(0L);
        group.setName("admin");

        User guestUser = new User();
        guestUser.setId(2L);
        guestUser.setName("guest");

        User rootUser = new User();
        rootUser.setId(3L);
        rootUser.setName("root");

        group.addUser(guestUser);
        group.addUser(rootUser);

        String json = JSON.toJSONString(group);
        log.info("json == {}", json);

        Group group1 = JSON.parseObject(json, Group.class);
        log.info("group1 == {}", group1);
    }
}
