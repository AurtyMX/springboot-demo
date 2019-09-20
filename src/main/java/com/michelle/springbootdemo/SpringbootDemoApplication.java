package com.michelle.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.stereotype.Indexed;

import javax.annotation.Resource;

//@Indexed
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableSpringConfigured
@EnableCaching
public class SpringbootDemoApplication implements CommandLineRunner {
    @Autowired
    private BeanFactoryDemo beanFactoryDemo;
    @Autowired
    private BeanPostProcessorDemo beanPostProcessorDemo;
    //    @Autowired
//    private TransferService transferService;
    @Autowired
    private TransferServiceImplB transferServiceImplB;
    @Resource
    private AspectDemo2 aspectDemo2;
    @Resource
    private CacheProxyDemo cacheProxyDemo;


    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);
        ConfigurableBeanDemo configurableBeanDemo = context.getBean(ConfigurableBeanDemo.class);
        System.out.println("configurable:" + configurableBeanDemo.getBeanB());
    }

    @Override
    public void run(String... args) throws Exception {
        beanPostProcessorDemo.initial();
        aspectDemo2.test1();
        cacheProxyDemo.test1(0);
        cacheProxyDemo.test2(0);
        cacheProxyDemo.test1(0);
//        beanFactoryDemo.demo1();
//        beanFactoryDemo.demo3();
    }

//    @Bean
//    public InstrumentationLoadTimeWeaver loadTimeWeaver() throws Throwable {
//        InstrumentationLoadTimeWeaver loadTimeWeaver = new InstrumentationLoadTimeWeaver();
//        return loadTimeWeaver;
//    }
}
