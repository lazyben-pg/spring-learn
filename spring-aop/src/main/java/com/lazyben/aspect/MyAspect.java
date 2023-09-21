package com.lazyben.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class MyAspect {
    @Before("execution(* com.lazyben.service.UserService.*(..))")
    public void before(){
        System.out.println("before method invoke");
    }

    @After("execution(* com.lazyben.service.UserService.*(..))")
    public void after(){
        System.out.println("after method invoke");
    }

    @AfterReturning("execution(* com.lazyben.service.UserService.*(..))")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    @AfterThrowing("execution(* com.lazyben.service.UserService.*(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    @Around("execution(* com.lazyben.service.UserService.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before");
        Object proceed = joinPoint.proceed();
        System.out.println("around after");
        return proceed;
    }
}
