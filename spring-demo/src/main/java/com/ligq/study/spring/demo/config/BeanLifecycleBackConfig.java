package com.ligq.study.spring.demo.config;

import com.ligq.study.spring.demo.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanLifecycleBackConfig {

    @Bean(initMethod = "init", destroyMethod = "shutdown")
    public Person person(){
        return new Person();
    }
}
