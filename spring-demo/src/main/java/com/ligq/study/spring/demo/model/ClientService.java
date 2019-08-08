package com.ligq.study.spring.demo.model;

/**
 * 使用静态工厂方法实例化
 */
public class ClientService {
    private static ClientService clientService = new ClientService();

    private ClientService() {
    }

    public static ClientService createInstance() {
        return clientService;
    }
}
