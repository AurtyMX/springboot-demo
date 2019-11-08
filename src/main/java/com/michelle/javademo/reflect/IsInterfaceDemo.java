package com.michelle.javademo.reflect;


public class IsInterfaceDemo {
    public static void main(String[] args) {
        System.out.println(Test.class.isInterface());
        System.out.println(TestClass.class.isInterface());
    }

    interface Test {

    }

    class TestClass implements Test {

    }
}
