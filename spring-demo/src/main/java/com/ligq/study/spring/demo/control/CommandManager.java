package com.ligq.study.spring.demo.control;

import com.ligq.study.spring.demo.service.CommandService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * singletons 中引入非 singletons 示例，根据application.getBean()获取非单例的Bean
 */
public class CommandManager implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public Object process() {
        CommandService commandService = this::createCommand;
        return commandService.execute();
    }

    protected CommandService createCommand() {
        return applicationContext.getBean("asyncCommandServiceImpl", CommandService.class);
    }
}
