/**
 * @Description
 * @Author Ligq
 * @Date 2021/1/7 5:44 下午
 * @Version V1.0
 */
package com.study.ligq.apollo.demo.config;

import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.Set;

@Slf4j
@Configuration
@EnableApolloConfig
public class ApolloConfig implements ApplicationContextAware {

    @Autowired
    private ObjectMapper objectMapper;

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @ApolloConfigChangeListener(value = "application", interestedKeyPrefixes = "test")
    public void onChange(ConfigChangeEvent changeEvent) throws JsonProcessingException {
        ApolloProperties bean = applicationContext.getBean(ApolloProperties.class);
        log.info("Apollo Property == {}, jsonValue == {}", bean, objectMapper.writeValueAsString(bean));
        refreshBean(bean.getClass(), "apolloProperties");
        ApolloProperties bean2 = applicationContext.getBean(ApolloProperties.class);
        log.info("Apollo Property2 == {}, jsonValue2 == {}", bean2, objectMapper.writeValueAsString(bean2));

        log.info("Apollo Property == {}, jsonValue == {}", bean, objectMapper.writeValueAsString(bean));
        refreshBean(XmlBean.class, "xmlBean");
        XmlBean xmlBean = applicationContext.getBean(XmlBean.class);
        log.info("Apollo Property2 == {}, jsonValue2 == {}", xmlBean, objectMapper.writeValueAsString(bean2));
    }

    private <T> void refreshBean(Class reference, String beanName){
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory)applicationContext.getAutowireCapableBeanFactory();
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
        beanFactory.removeBeanDefinition(beanName);
        beanFactory.registerBeanDefinition(beanName, beanDefinition);
        Set<Map.Entry<String, T>> set = applicationContext.getBeansOfType(reference)
                .entrySet();
        set.forEach(f -> f.setValue((T) applicationContext.getBean(f.getKey())));
    }
}
