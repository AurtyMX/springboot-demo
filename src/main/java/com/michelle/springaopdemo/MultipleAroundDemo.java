package com.michelle.springaopdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MultipleAroundDemo {
    //    @Around(value = "execution(MultipleAroundDemo3 test())")
    @Around(value = "@annotation(multipleAroundDemoAnnotation)")
    public Object around(ProceedingJoinPoint point, MultipleAroundDemoAnnotation multipleAroundDemoAnnotation) throws Throwable {
        System.out.println("test aspect 1");
        Object object = point.proceed();
        return ((String) object) + ",add test aspect 1";
    }

    @Before(value = "@annotation(multipleAroundDemoAnnotation)")
    public void before(MultipleAroundDemoAnnotation multipleAroundDemoAnnotation) throws Throwable {
        System.out.println("test before aspect 1");
    }
}
