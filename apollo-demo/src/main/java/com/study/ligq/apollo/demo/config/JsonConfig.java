/**
 * @Description
 * @Author Ligq
 * @Date 2021/1/8 11:46 上午
 * @Version V1.0
 */
package com.study.ligq.apollo.demo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonConfig {

    @Bean
    public ObjectMapper objectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper;
    }
}
