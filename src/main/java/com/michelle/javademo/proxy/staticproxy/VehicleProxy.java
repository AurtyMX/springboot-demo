package com.michelle.javademo.proxy.staticproxy;

public class VehicleProxy implements Vehicle {
    private Vehicle vehicle;

    public VehicleProxy(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void start() {
        System.out.println("The proxy vehicle starts...");
        vehicle.start();
    }

    @Override
    public void run() {
        System.out.println("The proxy vehicle is running...");
        vehicle.run();
    }

    @Override
    public void stop() {
        System.out.println("The proxy vehicle stops...");
        vehicle.stop();

    }
}
