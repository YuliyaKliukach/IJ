package com.class16;

public class InstanceVariablesDemo {

    int number=10; //instance variable

    void printNumber(){
        String name="Asghar";
        System.out.println(number);
    }
    void printNumber2(){
        System.out.println(number); // number is instance variable
       // System.out.println(name); - name cannot be used here - its local variable
    }
    public static void main(String[] args) {

        InstanceVariablesDemo obj=new InstanceVariablesDemo();
        System.out.println(obj.number);

    }
}
