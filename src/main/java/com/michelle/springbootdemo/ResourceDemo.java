package com.michelle.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;

/**
 * @author michelle.min
 */

@Component
public class ResourceDemo {

    @Autowired
    private ApplicationContext context;

    @PostConstruct
    public void test1() throws IOException {
//        Resource resource = context.getResource("classpath:application.properties");
        /**
         * 不能获取
         */
        Resource resource = context.getResource("E:\\minxue\\software\\maven\\com\\aug3\\sys\\1.1.44\\sys-1.1.44.jar!\\log4j.properties");
        /**
         * 可获取
         */
//        Resource resource = context.getResource("classpath:log4j.properties");
        /**
         * 可获取
         */
//        Resource resource = context.getResource("jar:file:/E:/minxue/software/maven/com/aug3/sys/1.1.44/sys-1.1.44.jar!/log4j.properties");
        /**
         * 不能获取
         */
//        Resource resource = context.getResource("file:/E:/minxue/software/maven/com/aug3/sys/1.1.44/sys-1.1.44.jar!/log4j.properties");
        System.out.println("resource is " + resource.getURL());
        System.out.println("resource is " + resource.contentLength());
    }
}
