package com.michelle.javademo.proxy.cglib;

import org.junit.Test;

public class Client {
    @Test
    public void test1() {
        Engineer proxy = (Engineer) CglibProxy.getProxy(new Engineer());
        proxy.eat();
        proxy.work();
    }
}
