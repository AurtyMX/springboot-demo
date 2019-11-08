package com.michelle.springaopdemo;

import org.springframework.stereotype.Component;

@Component
public class MultipleAroundDemo3 {
    @MultipleAroundDemoAnnotation
    public String test() {
        return "test 3";
    }
}
