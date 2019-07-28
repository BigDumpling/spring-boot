package com.study.ligq.custom.schema.demo.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 将组件注册到Spring容器
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
