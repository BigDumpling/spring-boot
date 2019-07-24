package com.ligq.study.spring.demo.service.impl;

import com.ligq.study.spring.demo.service.CommandService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(scopeName = "prototype")
public class AsyncCommandServiceImpl implements CommandService {
    @Override
    public Object execute() {
        return this;
    }
}
