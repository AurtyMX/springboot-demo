package com.michelle.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Indexed;

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


    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        beanPostProcessorDemo.initial();
//        beanFactoryDemo.demo1();
//        beanFactoryDemo.demo3();
    }
}
