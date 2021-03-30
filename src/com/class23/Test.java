package com.class23;

public class Test {
    public static void main(String[] args) {
        System.out.println("main from Parent");
    }
}

class Child1 extends Test{
    public static void main(String[] args) {
        System.out.println("main from Child");
    }
}

class Child2 {
    public static void main(String[] args) {
        String [] args1={"hi", "hello"};
        Child1.main(args1);
    }
}