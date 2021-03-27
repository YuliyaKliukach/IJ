package com.class19;

import java.sql.SQLOutput;

public class HomeTask1 {
    /*
    Write a program  that will have 4 different access levels of constructors
    and create 3 objects of this class:
    1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
     */
    String name;
    String homeWork;
    int num;
    double salary;

    HomeTask1(String nam, String homeWork, int num, double salary){
        this.name=name;
        this.homeWork=homeWork;
        this.num=num;
        this.salary=salary;
    }

    public static void main(String[] args) {
        HomeTask1 task1=new HomeTask1("Mark", "Constructors", 10, 300000);
        HomeTask1 task2=new HomeTask1("Max","Keywords", 25, 500000);

        System.out.println(task1.num);
        System.out.println(task2.homeWork);

    }
}
