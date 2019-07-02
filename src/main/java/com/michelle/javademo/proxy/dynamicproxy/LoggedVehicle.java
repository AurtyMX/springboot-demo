package com.michelle.javademo.proxy.dynamicproxy;

import com.michelle.javademo.proxy.staticproxy.Vehicle;

public class LoggedVehicle implements Vehicle {
    private Vehicle v;

    public LoggedVehicle(Vehicle v) {
        this.v = v;
    }

    @Override
    public void start() {
        System.out.println("Log Entry: Vehicle started");
        v.start();
    }

    @Override
    public void run() {
        System.out.println("Log Entry: Vehicle ran");
        v.run();
    }

    @Override
    public void stop() {
        System.out.println("Log Entry: Vehicle stopped");
        v.stop();
    }
}
