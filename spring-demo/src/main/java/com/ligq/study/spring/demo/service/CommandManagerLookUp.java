package com.ligq.study.spring.demo.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class CommandManagerLookUp {

    public CommandService process(){
        return this::createCommand;
    }

    @Lookup(value = "asyncCommandServiceImpl")
    protected abstract CommandService createCommand();
}
