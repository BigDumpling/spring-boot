/**
 * @Description
 * @Author Ligq
 * @Date 2021/1/7 5:43 下午
 * @Version V1.0
 */
package com.study.ligq.apollo.demo;

import com.study.ligq.apollo.demo.config.MyApplicationContextInitializer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ApolloDemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApolloDemoApplication.class);
//        application.addInitializers(new MyApplicationContextInitializer());
        application.run(args);
//        SpringApplication.run(ApolloDemoApplication.class, args);
    }
}
