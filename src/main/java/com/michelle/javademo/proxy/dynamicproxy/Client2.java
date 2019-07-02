package com.michelle.javademo.proxy.dynamicproxy;

import com.michelle.javademo.proxy.staticproxy.Car;
import com.michelle.javademo.proxy.staticproxy.Vehicle;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class Client2 {
    @Test
    public void test1() {
        Vehicle car = new Car();
        LoggedVehicle loggedVehicle = new LoggedVehicle(car);
        loggedVehicle.start();
        loggedVehicle.run();
        loggedVehicle.stop();
    }
}
