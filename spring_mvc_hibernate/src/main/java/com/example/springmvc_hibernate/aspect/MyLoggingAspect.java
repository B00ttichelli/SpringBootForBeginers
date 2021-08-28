package com.example.springmvc_hibernate.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* com.example.springmvc_hibernate.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(
            ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        MethodSignature methodSignature =(MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();
        
        System.out.println("Begin of" + methodName);
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("End of " + methodName);
        return proceed;
    }
}
