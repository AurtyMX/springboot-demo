package com.michelle.springaopdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MultipleAroundDemo2 {
    //    @Around(value = "execution(MultipleAroundDemo3 test())")
    @Around(value = "@annotation(MultipleAroundDemoAnnotation)")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("test aspect 2");
        Object object = point.proceed();
        return ((String) object) + ",add test aspect 2";
    }
}
