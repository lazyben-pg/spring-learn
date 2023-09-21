package com.lazyben.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyLogAspect {

    @Around("generalPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        String msg = String.format("%s#%s被调用，参数为%s", className, methodName, Arrays.toString(args));
        System.out.println(msg);
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println(String.format("调用时长为%s毫秒", end - start));
        return proceed;
    }

    @Pointcut("@annotation(com.lazyben.annotation.MyLog)")
    public void generalPointCut() {
    }
}
