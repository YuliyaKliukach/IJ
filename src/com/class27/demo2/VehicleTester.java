package com.class27.demo2;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw=new BMW("12345xml", "Sedan", "BMW", "X5");

        bmw.start();
        bmw.stop();
        bmw.speed();
        bmw.drive();
        bmw.display();

        Vehicle vehicle=new Toyota("11112222hhjk", "SUV", "Toyota", "RAV4");
        vehicle.start();

        Car car=new Toyota("11112222hhjk", "SUV", "Toyota", "RAV4");
        car.start();
        car.speed();

    }
}
