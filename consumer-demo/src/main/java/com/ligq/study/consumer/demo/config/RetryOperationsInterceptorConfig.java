//package com.ligq.study.consumer.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.retry.interceptor.RetryInterceptorBuilder;
//import org.springframework.retry.interceptor.RetryOperationsInterceptor;
//
//@Configuration
//public class RetryOperationsInterceptorConfig {
//
//    @Bean(name = "configServerRetryInterceptor")
//    public RetryOperationsInterceptor configServerRetryInterceptor() {
//        return RetryInterceptorBuilder.stateless().maxAttempts(1000).maxAttempts(6).build();
//    }
//}
