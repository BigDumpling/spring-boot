package com.ligq.study.spring.demo;

import com.ligq.study.spring.demo.model.ApplicationYml;
import com.ligq.study.spring.demo.model.Company;
import com.ligq.study.spring.demo.model.Employee;
import com.ligq.study.spring.demo.service.CommandManager;
import com.ligq.study.spring.demo.service.CommandManagerLookUp;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;
import java.util.Set;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CommandManagerTest {

    @Autowired
    private CommandManager commandManager;
    @Autowired
    private CommandManagerLookUp commandManagerLookUp;
    @Autowired
    private Set<BeanPostProcessor> beanPostProcessors;
    @Autowired
    private ApplicationYml applicationYml;

    @Autowired
    private Map<String, BeanPostProcessor> beanPostProcessorMap;


    @Test
    public void singletonTest() {
//        log.info("address1 == {}", commandManager.process());
//        log.info("address2 == {}", commandManager.process());
    }

    @Test
    public void singletonTest2() {
        log.info("address1 == {}", commandManagerLookUp.process());
        log.info("address2 == {}", commandManagerLookUp.process());
    }

    @Test
    public void beanTest(){

//        log.info("beanPostProcessors == {}", beanPostProcessors);
//        for (BeanPostProcessor beanPostProcessor : beanPostProcessors) {
//            log.info("beanPostProcessor == {}", beanPostProcessor);
//        }

        beanPostProcessorMap.entrySet()
                .stream()
                .forEach(f -> {
                    log.info("f =={}", f);
                });

        log.info("---------------------------------------------------------------------------------------------------------------");

        ClassPathResource resource = (ClassPathResource) applicationYml.getResource();

        log.info("Resource == {}", applicationYml.getResource());
    }

    @Test
    public void beanWrapperTest(){
        BeanWrapper company = new BeanWrapperImpl(new Company());
        company.setPropertyValue("name", "Some Company Inc.");
        PropertyValue value = new PropertyValue("name", "Some Company Inc.");
        company.setPropertyValue(value);

        BeanWrapper jim = new BeanWrapperImpl(new Employee());
        jim.setPropertyValue("name", "Jim Stravinsky");
        company.setPropertyValue("employee", jim.getWrappedInstance());
        Float salary = (Float) company.getPropertyValue("employee.salary");

        log.info("company == {}", company);
    }
}
