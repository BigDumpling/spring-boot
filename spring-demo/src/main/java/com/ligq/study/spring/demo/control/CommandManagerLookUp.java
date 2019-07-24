package com.ligq.study.spring.demo.control;

import com.ligq.study.spring.demo.service.CommandService;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * singletons 中引入非 singletons 示例，使用@Lookup注解实现
 */
@Component
public abstract class CommandManagerLookUp {

    public Object process() {
        CommandService commandService = this::createCommand;
        return commandService;
    }
    
    @Lookup(value = "asyncCommandServiceImpl")
    protected abstract CommandService createCommand();
}
