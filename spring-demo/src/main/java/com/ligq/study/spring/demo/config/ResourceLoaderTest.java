package com.ligq.study.spring.demo.config;

import com.ligq.study.spring.demo.model.ApplicationYml;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class ResourceLoaderTest {
    @Bean
    public ApplicationYml applicationYml(){
        ApplicationYml yml = new ApplicationYml();
        ClassPathResource resource = new ClassPathResource("classpath:application.yml");
        yml.setResource(resource);
        return yml;
    }
}
