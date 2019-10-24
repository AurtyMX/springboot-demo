package com.michelle.javademo.thread;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * thread safe ,you can modify the list when traverse the list
 */
public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer i : list) {
            System.out.println(i);
            list.add(i + 5);
        }
        System.out.println(list);
    }
}
