package com.ligq.study.spring.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Slf4j
@EnableAspectJAutoProxy
@EnableDiscoveryClient
@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);

        /**
         * 使用AnnotationConfigAplicationContext实例化Spring容器，启动项目
         */
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldServiceImpl.class);
//        HelloWorldServiceImpl controller = (HelloWorldServiceImpl)applicationContext.getBean("helloWorldServiceImpl");
//        controller.sayHello();
//        applicationContext.scan("com.ligq.study.spring.demo");
//        applicationContext.refresh();
//        applicationContext.start();
//        applicationContext.registerShutdownHook();
//        applicationContext.stop();
//        applicationContext.refresh();
//        Person person = applicationContext.getBean(Person.class);
//        log.info("Person.name == {}", person.name);
//        ConfigurableEnvironment env = applicationContext.getEnvironment();
//        log.info("active profiles == {}", env.getActiveProfiles());
//        log.info("active profiles == {}", env.getPropertySources());
//        log.info("have application name == {}", env.containsProperty("spring.application.name"));

//        String message = applicationContext.getMessage("message", null, "Default", null);
//        log.info("message == {}", message);
//
//        String message2 = applicationContext.getMessage("argument.required", new Object[]{"userDao"}, null);
//        log.info("message2 == {}", message2);
//
//        String message3 = applicationContext.getMessage("argument.required", new Object[]{"userDao"}, Locale.UK);
//        log.info("message3 == {}", message3);

//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        factory.addBeanPostProcessor(new BeanPostProcessorTest());

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) context.getBeanFactory();
//        defaultListableBeanFactory.registerSingleton("", "");
//        defaultListableBeanFactory.registerBeanDefinition("", BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition());

    }
}
