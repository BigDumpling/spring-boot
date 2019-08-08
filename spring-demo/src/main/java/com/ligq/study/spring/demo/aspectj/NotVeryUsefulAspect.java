package com.ligq.study.spring.demo.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class NotVeryUsefulAspect {

    @Pointcut("execution(* org.springframework..*.*(..))")
    public void springPointcut() {
    }

    @Pointcut("execution(* com.ligq.study.spring.demo..*.*(..))")
    public void applicationPointcut() {
    }

    @Pointcut("this(com.ligq.study.spring.demo.proxy.UserServiceImpl)")
    public void thisService() {
    }

    @Pointcut("target(com.ligq.study.spring.demo.proxy.UserServiceImpl)")
    public void targetService() {
    }

    @Around(value = "thisService()")
    public Object aroundThisService(ProceedingJoinPoint point) throws Throwable {
        log.info("----- NotVeryUsefulAspect.aroundThisService() before -----");
        log.info("====== point={}", point);
        log.info("====== point.args={}", point.getArgs());
        log.info("====== point.this={}", point.getThis());
        log.info("====== point.target={}", point.getTarget());
        log.info("====== point.signature={}", point.getSignature());
        Object result = null;
        try {
            result = point.proceed();
            log.info("----- NotVeryUsefulAspect.aroundThisService() after-----");
        } catch (Throwable throwable) {
            log.error("----- NotVeryUsefulAspect.aroundThisService() error == {}", throwable.getLocalizedMessage());
            //throw throwable;
        }
        log.info("----- NotVeryUsefulAspect.aroundThisService() result == {}", result);
        return result;
    }

    @AfterThrowing(pointcut = "thisService()", throwing = "ex")
    public void processThrow(Throwable ex){
        log.error("----- NotVeryUsefulAspect.processThrow() error == {}", ex.getLocalizedMessage());
    }
}
