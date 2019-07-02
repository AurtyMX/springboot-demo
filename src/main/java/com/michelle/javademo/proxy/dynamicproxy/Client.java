package com.michelle.javademo.proxy.dynamicproxy;

import com.michelle.javademo.proxy.staticproxy.Car;
import com.michelle.javademo.proxy.staticproxy.Vehicle;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class Client {
    @Test
    public void test1() {
        Vehicle car = new Car();
        Vehicle proxy = (Vehicle) Proxy.newProxyInstance(
                Vehicle.class.getClassLoader(),
                new Class[]{Vehicle.class},
                new VehicleHandler(car));
        proxy.start();
        proxy.run();
        proxy.stop();
    }
}
