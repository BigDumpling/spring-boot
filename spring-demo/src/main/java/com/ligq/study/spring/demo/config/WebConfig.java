package com.ligq.study.spring.demo.config;

import com.ligq.study.spring.demo.control.CommandManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public CommandManager commandManager() {
        return new CommandManager();
    }
}
