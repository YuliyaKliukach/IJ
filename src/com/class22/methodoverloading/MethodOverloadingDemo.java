package com.class22.methodoverloading;

public class MethodOverloadingDemo {

    void add(int a, int b){
        System.out.println(a+b);
    }

    void add(double a, double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo methodOverloadingDemo=new MethodOverloadingDemo();
        methodOverloadingDemo.add(10,20);
        methodOverloadingDemo.add(12.0, 12.0);
    }
}
