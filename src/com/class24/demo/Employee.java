package com.class24.demo;

public class Employee {
    double salary;
    void work(){
        System.out.println("Employee is working");
    }

    void getPaid(){
        System.out.println("Employee is getting paid "+salary);
    }

    void goOnLeaves(){
        System.out.println("Employee is going on");
    }
}

class FullTimeEmployee extends Employee{

}

class PartTimeEmployee extends Employee{
    @Override
    void goOnLeaves() {
        System.out.println("Part time employees don't get leaves");
    }
}

class Contractor extends Employee{
    @Override
    void goOnLeaves() {
        System.out.println("Contractor employees don't get leaves");
    }

}