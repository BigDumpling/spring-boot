///**
// * @Description
// * @Author Ligq
// * @Date 2021/1/7 5:45 下午
// * @Version V1.0
// */
//package com.study.ligq.apollo.demo.config;
//
//import com.ctrip.framework.apollo.model.ConfigChange;
//import com.ctrip.framework.apollo.model.ConfigChangeEvent;
//import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import lombok.Data;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.stereotype.Component;
//
//import java.util.Objects;
//import java.util.Set;
//
//@Slf4j
//@Data
//@Component
//@RefreshScope
//@ConfigurationProperties(prefix = "refresh")
//public class ApolloProperties2 {
//
//    @Autowired
//    private org.springframework.cloud.context.scope.refresh.RefreshScope refreshScope;
//
//    private String enabled;
//
//    @ApolloConfigChangeListener(interestedKeyPrefixes = "refresh")
//    public void refresh(ConfigChangeEvent changeEvent) throws JsonProcessingException {
//        refreshScope.refreshAll();
//    }
//}
