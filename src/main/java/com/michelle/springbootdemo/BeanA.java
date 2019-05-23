package com.michelle.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component
public class BeanA {
    //    @Autowired
    @Resource
    private BeanB beanB;

//    public BeanA(BeanB beanB) {
//        this.beanB = beanB;
//    }

    @PostConstruct
    public void init() {
        System.out.println("Bean A initial success!");
    }

    private void testTransactional() {
        System.out.println("test transactional!");
    }
}
