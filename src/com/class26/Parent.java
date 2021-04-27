package com.class26;

public class Parent {

    final void method1(){
        System.out.println("Try to change me");
    }

    protected void print2() {
    }
}

class Child extends Parent{
}
