package com.michelle.javademo.proxy.staticproxy;

import org.junit.Test;

public class VehicleTest {
    /**
     * no proxy
     */
    @Test
    public void test1() {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.run();
        vehicle.stop();
    }

    /**
     * proxy
     */
    @Test
    public void test2() {
        Vehicle proxyVehicle = new VehicleProxy(new Car());
        proxyVehicle.start();
        proxyVehicle.run();
        proxyVehicle.stop();
    }
}
