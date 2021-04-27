package com.class24.demo3;

public class Person {

    String name;
    int age;
    void sleep(){
        System.out.println("Person sleeps");
    }

    void eat(){
        System.out.println("Person eats");
    }
}
class Employee extends Person{

}

class Teacher extends Person{

}

class Student extends Person{

}