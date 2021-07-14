/**
 * @Description
 * @Author Ligq
 * @Date 2021/1/7 5:45 下午
 * @Version V1.0
 */
package com.study.ligq.apollo.demo.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Slf4j
@Data
@Component
@ConfigurationProperties(prefix = "test")
public class ApolloProperties {

    private String name;

    private Integer age;
}
