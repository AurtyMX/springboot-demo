package com.michelle.springbootdemo;

public class ConfigurationDemo3 extends ConfigurationDemo2 {

//    public ConfigurationDemo3(int a) {
//        super(a);
//    }


//    public ConfigurationDemo3(int a) {
//        super(a);
//    }

    public ConfigurationDemo3(int a, int b) {
        super(a, b);
    }

    public ConfigurationDemo3() {
        super(1);
    }

    public void test2() {
        System.out.println(super.a);
    }
}
