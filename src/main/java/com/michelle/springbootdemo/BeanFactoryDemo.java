package com.michelle.springbootdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryDemo {
    @Autowired
    private BeanFactory beanFactory;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private DefaultListableBeanFactory defaultListableBeanFactory;

    public void demo1() {
        boolean isContains = beanFactory.containsBean("beanFactoryDemo");
        System.out.println(isContains);
    }

    public void demo2() {
        applicationContext.getBeanDefinitionCount();
    }

    public void demo3() {
        //注册，但spring官方不推荐runtime时候注册，容易导致并发问题
        defaultListableBeanFactory.registerSingleton("com.michelle.springbootdemo.BeanFactoryDemo.BeanFactoryRegister", new BeanFactoryRegister());
        boolean isContains = beanFactory.containsBean("com.michelle.springbootdemo.BeanFactoryDemo.BeanFactoryRegister");
        System.out.println(isContains);
    }

    class BeanFactoryRegister {
        private String name = "test";
    }
}
