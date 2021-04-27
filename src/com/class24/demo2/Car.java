package com.class24.demo2;

public class Car {

    String make;
    String model;
    void start(){
        System.out.println("Use the key to start me");
    }

    void stop(){
        System.out.println("Use the break to stop me");
    }
    void park(){
        System.out.println("Park manually");
    }
}

class BMW extends Car{
    @Override
    void start() {
        System.out.println("Use the button to start me");
    }

    void drift(){
        System.out.println("I can drift really good in rain");
    }
}

class Tesla extends Car{
    @Override
    void start() {
        System.out.println("Use App to start me");
    }

    @Override
    void park() {
        System.out.println("I will park by myself");
    }
}

class Toyota extends Car{

}
