package com.michelle.springbootdemo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringbootDemoApplication implements CommandLineRunner {
    @Autowired
    private BeanFactoryDemo beanFactoryDemo;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        beanFactoryDemo.demo1();
        beanFactoryDemo.demo3();
    }
}
