package com.ligq.study.design.patterns.demo;

import com.ligq.study.design.patterns.demo.builder.User;

public class DesignPatternsDemoApplication {

    public static void main(String[] args) {
        User user = new User.Builder("李", "国强")
                .age(24)
                .phone("13*******50")
                .address("上海")
                .build();
    }
}
