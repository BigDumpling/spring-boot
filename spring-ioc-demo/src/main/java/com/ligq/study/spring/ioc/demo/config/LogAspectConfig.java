package com.ligq.study.spring.ioc.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LogAspectConfig {

    @Pointcut("execution(* com.ligq.study.spring.ioc.demo.service.Demo1Service.*(..))")
//    @Pointcut("target(com.ligq.study.spring.ioc.demo.service.Demo1Service)")
    public void demoServicePoint() {

    }

    @Around(value = "demoServicePoint()")
    public void logPrint(ProceedingJoinPoint point) throws Throwable {
        log.info("----------start----------");
        try {
            point.proceed();
        } catch (Throwable throwable) {
            log.info("环绕通知异常");
            throwable.printStackTrace();
            throw throwable;
        }
        log.info("----------end----------");
    }

    @AfterThrowing(pointcut = "demoServicePoint()", throwing = "ex")
    public void exceptionProcess(Throwable ex) throws Throwable {
        log.info("异常通知");
        throw ex;
    }

}
