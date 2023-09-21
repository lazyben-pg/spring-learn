package com.lazyben.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectWithAnnotation {
    @Before("generalPointCut()")
    public void before() {
        System.out.println("before method invoke");
    }

    @After("generalPointCut()")
    public void after() {
        System.out.println("after method invoke");
    }

    @AfterReturning("generalPointCut()")
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    @AfterThrowing("generalPointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    @Around("generalPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before");
        Object proceed = joinPoint.proceed();
        System.out.println("around after");
        return proceed;
    }

    @Pointcut("@annotation(com.lazyben.annotation.MyAnnotation)")
    public void generalPointCut() {
    }
}
