package com.class21;

public class Teacher extends Employee{
    String degree;

    void teach(){
        System.out.println(name+" teaching");
    }
    void confusing(){
        System.out.println(name+" is confusing students");
    }

}
