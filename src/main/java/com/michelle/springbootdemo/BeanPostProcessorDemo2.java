package com.michelle.springbootdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

import javax.annotation.PostConstruct;

public class BeanPostProcessorDemo2 implements BeanPostProcessor {
    @PostConstruct
    public void initial() {
        System.out.println(this.getClass().getName() + " initial success!");
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("beanFactoryDemo".equalsIgnoreCase(beanName)) {
            System.out.println("processor2 doing:" + beanName);
        }
        return null;
    }
}
