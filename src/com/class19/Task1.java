package com.class19;

public class Task1 {

    String name;
    Task1(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1("Tim");

        System.out.println(task1.name);
    }

}
