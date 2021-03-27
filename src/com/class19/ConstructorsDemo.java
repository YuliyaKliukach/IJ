package com.class19;

public class ConstructorsDemo {

    ConstructorsDemo(){
        System.out.println("Constructor called");
    }

    int returnNumber(){
        return 10;
    }

    public static void main(String[] args) {
        ConstructorsDemo constructorsDemo=new ConstructorsDemo();

        int var1= constructorsDemo.returnNumber();
    }
}
