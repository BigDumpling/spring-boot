/**
 * @Description
 * @Author Ligq
 * @Date 2021/1/7 5:46 下午
 * @Version V1.0
 */
package com.study.ligq.apollo.demo;

import com.study.ligq.apollo.demo.config.ApolloProperties;
import com.study.ligq.apollo.demo.config.XmlBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequestMapping
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private ApolloProperties apolloProperties;

//    @Autowired
//    private ApolloProperties2 apolloProperties2;

//    @Value("${test.name}")
//    private String testName;
//    @Value("${refresh.enabled}")
//    private String enabled;
//
    @GetMapping(path = "/test01")
    public void test01() {
        log.info("test01, testName == {}", apolloProperties.getName());
        log.info("test01, age == {}", apolloProperties.getAge());

//        log.info("test01, xml name == {}", xmlBean.getName());
//        log.info("test01, xml age == {}", xmlBean.getAge());
    }

    @GetMapping(path = "/test02")
    public void test02() {
        log.info("test02, testName == {}", apolloProperties.getName());
//        log.info("test02, enabled == {}", apolloProperties2.getEnabled());
    }

}
