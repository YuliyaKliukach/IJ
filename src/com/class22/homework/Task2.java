package com.class22.homework;

public class Task2 {

    Task2(){
        System.out.println("I love programming languages");
    }

    Task2(String str){
        System.out.println("I love programming language "+str);
    }

    public static void main(String[] args) {
        new Task2();
        new Task2("Java");
    }
}
