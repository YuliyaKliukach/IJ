package com.class24.demo2;

public class CarTester {

    public static void main(String[] args) {

        Car bmw=new BMW();

        bmw.start();
        bmw.stop();
        // bmw.drifting - not possible

        BMW bmw1=(BMW)bmw; //bcz now we have converted our reference back to BMW

        bmw1.drift();
        ((BMW) bmw).drift();

        Car car=new Tesla();
        BMW bmw2=(BMW) car;
    }
}
