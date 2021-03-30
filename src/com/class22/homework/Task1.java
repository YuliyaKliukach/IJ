package com.class22.homework;

public class Task1 {

    void area(double length){
        System.out.println(length*length);
    }

    void area(double length, double width){
        System.out.println(length*width);
    }

    void area(double length, double width, double height){
        System.out.println(length*width*height);
    }

    public static void main(String[] args) {
        Task1 task=new Task1();

        task.area(12);
        task.area(12,14);
        task.area(12,13,14);
    }
}
