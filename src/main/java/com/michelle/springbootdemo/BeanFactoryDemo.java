package com.michelle.springbootdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BeanFactoryDemo {
    @Autowired
    private BeanFactory beanFactory;
    //    @Autowired
    @Resource
    private ApplicationContext applicationContext;
    @Autowired
    private DefaultListableBeanFactory defaultListableBeanFactory;

    /**
     * bean有唯一标识name，默认bean name为class name首字母小写
     */
    public void demo1() {
        boolean isContains = beanFactory.containsBean("BeanFactoryDemo");
        System.out.println(isContains);
    }

    public void demo2() {
        applicationContext.getBeanDefinitionCount();
    }

    /**
     * 注册，但spring官方不推荐runtime时候注册，容易导致并发问题
     */
    public void demo3() {
        defaultListableBeanFactory.registerSingleton("com.michelle.springbootdemo.BeanFactoryDemo.BeanFactoryRegister", new BeanFactoryRegister());
        boolean isContains = beanFactory.containsBean("com.michelle.springbootdemo.BeanFactoryDemo.BeanFactoryRegister");
        System.out.println(isContains);
    }

    class BeanFactoryRegister {
        private String name = "test";
    }
}
