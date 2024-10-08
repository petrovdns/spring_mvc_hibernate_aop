package com.petrovdns.mvc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * <p>Instagram: @petrovdns
 * <p>Telegram: +37379666011 | @ixyck
 */

@Component
@Aspect
public class MyLoggingAspect {

    @Around("com.petrovdns.mvc.pointcut.MyPointcut.allExecutableMethod()")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {

        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        String methodName = methodSignature.getName();

        System.out.println("[Begin of " + methodName + "]");

        Object targetMethodResult = proceedingJoinPoint.proceed();

        System.out.println("[End of " + methodName + "]");

        return targetMethodResult;
    }

}
