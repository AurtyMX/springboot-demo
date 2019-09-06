package com.michelle.springbootdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;

import javax.annotation.PostConstruct;

@Configuration
public class BeanPostProcessorDemo implements BeanPostProcessor {
    @Autowired
    private ApplicationContext context;
    @Autowired
    private BeanB beanB;
    /**
     * 因为aop processor也是使用procesor实现，所以被直接引用的bean没法被processor回调
     * 启动日志会有说明：Bean 'beanFactoryDemo' of type [com.michelle.springbootdemo.BeanFactoryDemo] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
     */
    @Autowired
    private BeanFactoryDemo beanFactoryDemo;

    @PostConstruct
    public void initial() {
        System.out.println(this.getClass().getName() + " initial success!");
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        BeanB b = InjectionPointDemo.beanB2();
//        System.out.println(context.containsBean("beanB2"));
//        System.out.println(beanName);
        if ("beanFactoryDemo".equalsIgnoreCase(beanName)) {   //发现这个接口没有应用到bean name为beanFactoryDemo和beanB的bean，取消掉field上的autowired就可以
            System.out.println("processor1 doing:" + beanName);
        }
        return null;
    }
}
