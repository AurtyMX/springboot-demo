package com.michelle.springbootdemo;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectDemo {

    @Pointcut("execution(AspectDemo2 test*())")
    @After("execution(AspectDemo2 test*())")
    public void testAspect1() {
        System.out.println("aspect log...");
    }
}
