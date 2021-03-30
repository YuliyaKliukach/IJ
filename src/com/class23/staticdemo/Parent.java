package com.class23.staticdemo;

public class Parent {

    static void printInfo(String name){
        System.out.println("name from parent "+name);
    }
}
class Child extends Parent{
    static void printInfo(String name){
        System.out.println("name from child "+name);
    }

    public static void main(String[] args) {
        Child.printInfo("Yuliya");
    }
}