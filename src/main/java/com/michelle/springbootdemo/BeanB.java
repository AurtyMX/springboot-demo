package com.michelle.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * 1. get set支持循环依赖以及自身依赖，autowired和resource注解都支持
 * 2. 构造函数不能支持玄幻依赖和自身依赖
 */
@Component
public class BeanB {
        @Autowired
//    @Resource
//        @Qualifier("bb")
    private BeanA beanA;
//    @Autowired
//    @Resource
//    private BeanB beanB;

//    public BeanB(BeanB beanB) {
////        this.beanA = beanA;
//        this.beanB = beanB;
//    }

    @PostConstruct
    public void init() {
        System.out.println("Bean B initial success!");
    }

    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }
}
