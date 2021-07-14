package com.ligq.study.spring.ioc.demo;

import com.ligq.study.spring.ioc.demo.config.DemoConfig;
import com.ligq.study.spring.ioc.demo.service.Demo1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;

@Slf4j
@SpringBootApplication(scanBasePackages = {"com.ligq.study.spring.ioc.demo", "com.dzg.doraemon.memcached"})
//@EnableAspectJAutoProxy
//@EnableTransactionManagement
public class SpringIocDemoApplication {

    public static void main(String[] args) {
        new ArrayList<>(Arrays.asList());
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);
//        Demo1Service demo1Service = (Demo1Service) applicationContext.getBean("demo1Service");
//        demo1Service.demo();


        new SpringApplication(SpringIocDemoApplication.class).run();
    }
}
