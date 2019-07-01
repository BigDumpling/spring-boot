package com.ligq.study.dubbo.server.service;

import com.ligq.study.dubbo.api.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

import java.util.concurrent.CompletableFuture;

@Slf4j
@Service(version = "1.0")
public class AsyncServiceImpl implements AsyncService {
    @Override
    public CompletableFuture<String> sayHello(String name) {
        RpcContext savedContext = RpcContext.getContext();
        return CompletableFuture.supplyAsync(() -> {
            log.info("localHost = {}", savedContext.getLocalHost());
            return "Hello AsyncServiceImpl";
        });
    }
}
