package com.michelle.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author michelle.min
 */

@Component
public class EnvironmentDemo {
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private ConfigurableApplicationContext configurableApplicationContext;


    public void test1() {
        Environment environment = applicationContext.getEnvironment();
        boolean contains = environment.containsProperty("foo");
        System.out.println("environment contains foo property? " + contains);
    }

    /**
     * 自定义propertySource
     */
    public void test2() {
        MutablePropertySources sources = configurableApplicationContext.getEnvironment().getPropertySources();
//        sources.addFirst(new MyPropertySource());
    }


}
