package com.michelle.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author michelle.min
 */

@Component
public class EnvironmentDemo {
    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    public void init() {
        Environment environment = applicationContext.getEnvironment();
        boolean contains = environment.containsProperty("foo");
        System.out.println("environment contains foo property? " + contains);
    }

}
