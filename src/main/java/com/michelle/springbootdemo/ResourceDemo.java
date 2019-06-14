package com.michelle.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author michelle.min
 */

@Component
public class ResourceDemo {

    @Autowired
    private ApplicationContext context;

    //    @PostConstruct
    public void test1() throws IOException {
//        Resource resource = context.getResource("classpath:application.properties");
        /**
         * 不能获取
         */
//        Resource resource = context.getResource("E:\\minxue\\software\\maven\\com\\aug3\\sys\\1.1.44\\sys-1.1.44.jar!\\log4j.properties");
        /**
         * 可获取
         */
//        Resource resource = context.getResource("classpath:log4j.properties");
//        Resource resource = context.getResource("classpath:/log4j.properties");
        /**
         * 不可获取
         */
        Resource resource = context.getResource("classpath:/log4j.properties");
        /**
         * 可获取
         */
//        Resource resource = context.getResources("classpath:/log4j.properties")[0];
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

    //        @PostConstruct
    public void test2() throws IOException {
        /**
         * 不能获取
         */
//        URL resource = context.getClass().getClassLoader().getResource("classpath*:log4j.properties");
        /**
         * 不能获取
         */
//        URL resource = context.getClass().getClassLoader().getResource("classpath:log4j.properties");
//        URL resource = ResourceDemo.class.getClassLoader().getResource("classpath*:log4j.properties");
        URL resource = ResourceDemo.class.getClassLoader().getResource("classpath*:META-INF/*.properties");
        System.out.println("resource is " + resource.getPath());
    }

    /**
     * 不可获取
     */
//    @PostConstruct
    public void test3() throws IOException {
        ResourcePatternResolver loader = new PathMatchingResourcePatternResolver();
        Resource resource = loader.getResource("classpath*:log4j.properties");
        System.out.println("resource is " + resource.getURL());
    }

    /**
     * 可获取
     */
//    @PostConstruct
    public void test4() throws IOException {
        ResourcePatternResolver loader = new PathMatchingResourcePatternResolver();
        Resource[] resource = loader.getResources("classpath*:log4j.properties");
        System.out.println("resource is " + resource[0].getURL());
    }

    /**
     * 不可获取
     */
//    @PostConstruct
    public void test5() throws IOException {
        Enumeration<URL> resource = ResourceDemo.class.getClassLoader().getResources("classpath*:log4j.properties");
        System.out.println("resource is " + resource.nextElement().getPath());
    }

    /**
     * 可获取
     */
//    @PostConstruct
    public void test6() throws IOException {
        Enumeration<URL> resource = ResourceDemo.class.getClassLoader().getResources("log4j.properties");
        System.out.println("resource is " + resource.nextElement().getPath());
    }

    /**
     * 可获取
     */
//    @PostConstruct
    public void test7() throws IOException {
        ResourcePatternResolver loader = new PathMatchingResourcePatternResolver();
        Resource[] resource = loader.getResources("classpath*:*.properties");
        System.out.println("resource is " + resource[0].getURL());
    }

    /**
     * 不可获取
     */
//    @PostConstruct
    public void test8() throws IOException {
        Enumeration<URL> resource = ResourceDemo.class.getClassLoader().getResources("*.properties");
        System.out.println("resource is " + resource.nextElement().getPath());
    }

    /**
     * 可获取
     */
    @PostConstruct
    public void test9() throws IOException {
        ResourceLoader loader = new DefaultResourceLoader();
//        Resource resource = loader.getResource("classpath:*.properties");
        Resource resource = context.getResource("classpath:*.properties");
        System.out.println("resource is " + resource.getURL());
    }
}
