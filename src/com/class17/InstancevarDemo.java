package com.class17;

public class InstancevarDemo {

    String name;
    int age;
    void printInfo(){ //if I'm inside class and method is not static I can use my instance variables
        double salary=120000;
        System.out.println(name+" "+age);
    }
}
