package com.michelle.javademo.proxy.dynamicproxy;

import com.michelle.javademo.proxy.staticproxy.Car;
import com.michelle.javademo.proxy.staticproxy.Vehicle;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class Client3 {
    @Test
    public void test1() {
        Vehicle car = new Car();
        Vehicle proxy = (Vehicle) Proxy.newProxyInstance(Vehicle.class.getClassLoader(),
                new Class[]{Vehicle.class},
                new GenericLogger(car));
        proxy.start();
        proxy.run();
        proxy.stop();
    }

    @Test
    public void test2() {
        Shap rectangle = new Rectangle();
        Shap proxy = (Shap) Proxy.newProxyInstance(Shap.class.getClassLoader(),
                new Class[]{Shap.class},
                new GenericLogger(rectangle));
        proxy.draw();
        proxy.move();
        proxy.print();
        proxy.resize();
    }
}
