package com.michelle.springbootdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MessageSourceDemo {
    @Resource
    private ApplicationContext context;

    public void test1(){
//        context.getMessage()
    }

}
