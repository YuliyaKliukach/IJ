package com.class22.demo1;

public class Dog extends Animal{

    String breed;
    Dog(){
        System.out.println("Child");
    }

    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed=breed;
        System.out.println("parametrized Child");
    }

    void printInfo(){
        System.out.println(name+" age "+age+" breed "+breed);
    }
}
