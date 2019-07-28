package com.study.ligq.custom.schema.demo;

import com.study.ligq.custom.schema.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@Slf4j
@SpringBootApplication
public class CustomSchemaDemoApplication {
    public static void main(String[] args){
//        new SpringApplicationBuilder(CustomSchemaDemoApplication.class).web(WebApplicationType.SERVLET).run();

//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:test.xml");
        BeanFactory context = new XmlBeanFactory(new ClassPathResource("classpath*:test.xml"));
        User user = (User) context.getBean("testBean");
        log.info("userName == {}, email == {}", user.getUserName(), user.getEmail());
    }
}
