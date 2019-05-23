package com.michelle.springbootdemo;

import com.sun.deploy.net.protocol.ProtocolType;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@Configuration
public class InjectionPointDemo {
//    @Autowired
//    @Qualifier("beanA2")
//    private BeanA beanA;

    @Autowired
    @Qualifier("beanB2")
    private BeanB beanB;

    @Autowired
    private ApplicationContext context;

    @PostConstruct
    public void initial() {
        System.out.println("initial success!");
        BeanA a = beanA3();
//        BeanB beanB = beanB2();
        System.out.println(context.containsBean("beanA3"));
        System.out.println(context.containsBean("beanB2"));
        System.out.println(context.containsBean("beanB4"));
    }

//    @Bean
//    @Qualifier("beanA2")
////    @Scope("prototype")
//    public BeanA beanA2(InjectionPoint injectionPoint) {
//        System.out.println(injectionPoint.getMember());
//        return new BeanA();
//    }

    @Bean
    @Qualifier("beanA3")
    private BeanA beanA3() {
        return new BeanA();
    }

    @Bean
    @Qualifier("beanB2")
    public static BeanB beanB2() {
        return new BeanB();
    }

    @Bean("beanB2")
    public static BeanB beanB3() {
        return new BeanB();
    }

    @Bean("beanB4")
    public static BeanB beanB4(BeanA beanA) {
        BeanB beanB = new BeanB();
        beanB.setBeanA(beanA);
        return beanB;
    }
}
