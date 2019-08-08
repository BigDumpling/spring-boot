package com.ligq.study.spring.demo.model;

/**
 * 实例工厂方法实例化bean
 */
public class DefaultServiceLocator {
    private static ClientServiceImpl clientService = new ClientServiceImpl();

    public ClientServiceImpl creatClientService() {
        return clientService;
    }
}
