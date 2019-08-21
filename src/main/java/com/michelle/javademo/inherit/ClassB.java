package com.michelle.javademo.inherit;

public class ClassB extends ClassA {
    public ClassB() {  //will call constructor of class a
        System.out.println("Class B...");
    }

    public static void main(String[] args) {
        new ClassB();
    }
}
