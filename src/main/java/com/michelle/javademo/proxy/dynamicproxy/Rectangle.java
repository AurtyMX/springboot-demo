package com.michelle.javademo.proxy.dynamicproxy;

public class Rectangle implements Shap {
    @Override
    public void draw() {
        System.out.println("draw rectangle...");
    }

    @Override
    public void print() {
        System.out.println("print rectangle...");
    }

    @Override
    public void move() {
        System.out.println("move rectangle...");
    }

    @Override
    public void resize() {
        System.out.println("resize rectangle...");
    }
}
