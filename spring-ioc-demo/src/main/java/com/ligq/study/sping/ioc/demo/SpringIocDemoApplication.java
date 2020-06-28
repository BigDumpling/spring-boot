package com.ligq.study.sping.ioc.demo;

import com.ligq.study.sping.ioc.demo.config.DemoConfig;
import com.ligq.study.sping.ioc.demo.service.Demo1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
@SpringBootApplication
public class SpringIocDemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);
        Demo1Service demo1Service = (Demo1Service) applicationContext.getBean("demo1Service");
        demo1Service.demo();
    }
}
