package com.class20;

public class Employee {
    private String name;
    private String empID;
    private double salary;
    private String department;

    public Employee(String name, String empID, double salary) {
        this.name = validateName(name);
        this.empID = empID;
        this.salary = salary;

    }

    public Employee(String name, String empID, double salary, String department) {
        this(name, empID, salary);
        this.department = department;
    }

    void printInfo(){
        System.out.println("Name "+name+" Employee ID "+empID);
    }

    String validateName(String name){
        if(name.length()<15){
            return name;
        }else{
            return null;
        }
    }
}
