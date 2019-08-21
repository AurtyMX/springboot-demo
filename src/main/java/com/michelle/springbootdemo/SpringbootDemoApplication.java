package com.michelle.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Indexed;

import javax.annotation.Resource;

@EnableAspectJAutoProxy
@Indexed
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
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


    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        beanPostProcessorDemo.initial();
        aspectDemo2.test1();
//        beanFactoryDemo.demo1();
//        beanFactoryDemo.demo3();
    }
}
