package com.petrovdns.mvc.pointcut;

import org.aspectj.lang.annotation.Pointcut;

/**
 * <p>Instagram: @petrovdns
 * <p>Telegram: +37379666011 | @ixyck
 */

public class MyPointcut {

    @Pointcut("execution(* com.petrovdns.mvc.dao.*.*(..))")
    public void allExecutableMethod() {
    }
}
