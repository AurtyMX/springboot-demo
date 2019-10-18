package com.michelle.javademo.thread;

/**
 * threadlocal lifecycle is connected thread, if thread is collected by gc and threadlocal will also collected.
 * we often use thread pool that thread in it always keeping alive maybe cause memory leak
 */
public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("hello");
        System.out.println(threadLocal.get());
        ThreadLocal<String> threadLocal2 = new ThreadLocal<>();
        System.out.println(threadLocal2.get());  // print null，each thread has a threadmap that can store data using threadlocal as map key
        threadLocal.set("hello3"); //print hello3,because same key
        System.out.println(threadLocal.get());
        System.out.println(Thread.currentThread());
    }
}
