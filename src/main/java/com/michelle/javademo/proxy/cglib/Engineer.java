package com.michelle.javademo.proxy.cglib;

public class Engineer {
    // 可以被代理
    public void eat() {
        System.out.println("engineer is eating...");
    }

    // final 方法不会被生成的字类覆盖
    public final void work() {
        System.out.println("engineer is working...");
    }

    // private 方法不会被生成的字类覆盖
    private void play() {
        System.out.println("engineer is playing game...");
    }
}
