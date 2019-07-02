package com.michelle.javademo.proxy.staticproxy;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The car starts...");
    }

    @Override
    public void run() {
        System.out.println("The car is running...");
    }

    @Override
    public void stop() {
        System.out.println("The car stops");

    }
}
