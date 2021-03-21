package com.class16;

public class Employee {
    /*
    Create a Class called Employee:
Create three  variables  empID , salary and set the CEO to "Sumair"
Create two objects of the class Employee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
     */

    String empID;
    double salary;
    String ceo="Sumair";

    void employeesDates(){
        System.out.println("Employee with ID "+empID+" has salary "+salary+" and CEO is "+ceo);
    }

    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.empID="123456";
        emp1.salary=150000;

        Employee emp2=new Employee();
        emp2.empID="654321";
        emp2.salary=180000;

        emp1.employeesDates();
        emp2.employeesDates();
    }

}
