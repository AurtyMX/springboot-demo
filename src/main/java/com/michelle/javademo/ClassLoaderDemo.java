package com.michelle.javademo;

import com.sun.javafx.binding.Logging;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.ArrayList;

public class ClassLoaderDemo {
    @Test
    public void test1() {
        System.out.println("Classloader of this class:" + ClassLoaderDemo.class.getClassLoader());
        System.out.println("Classloader of this class:" + StringUtils.class.getClassLoader());
        System.out.println("Classloader of this class:" + Logging.class.getClassLoader());
        System.out.println("Classloader of this class:" + ArrayList.class.getClassLoader());
    }
}
