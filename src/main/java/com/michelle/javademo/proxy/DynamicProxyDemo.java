package com.michelle.javademo.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;
import java.util.Map;

public class DynamicProxyDemo {
    @Test
    public void test1() {
        Map proxyInstance = (Map) Proxy.newProxyInstance(
                DynamicProxyDemo.class.getClassLoader(),
                new Class[]{Map.class},
                new InvocationHandlerDemo());
        proxyInstance.put("hello", "world");
    }

    /**
     * lambda表达式定义
     */
    @Test
    public void test2() {
        Map proxyInstance = (Map) Proxy.newProxyInstance(
                DynamicProxyDemo.class.getClassLoader(),
                new Class[]{Map.class},
                (proxy, method, methodArgs) -> {
                    if (method.getName().equals("get")) {
                        return 42;
                    } else {
                        throw new UnsupportedOperationException(
                                "Unsupported method: " + method.getName());
                    }
                });
        int i = (int) proxyInstance.get("hello"); // 42
        System.out.println(i);
        proxyInstance.put("hello", "world"); // exception
    }

    /**
     * lambda表达式定义
     */
    @Test
    public void test3() {
        Map proxyInstance = (Map) Proxy.newProxyInstance(
                DynamicProxyDemo.class.getClassLoader(),
                new Class[]{Map.class},
                (proxy, method, methodArgs) -> {
                    return 42;
                });
        int i = (int) proxyInstance.get("hello"); // 42
        System.out.println(i);
        i = (int) proxyInstance.put("hello", "world"); // 42
        System.out.println(i);
    }

    /**
     * 获取proxy instanse的class
     */
    @Test
    public void test4() {
        System.out.println(Proxy.getProxyClass(DynamicProxyDemo.class.getClassLoader(), Map.class));
    }
}
