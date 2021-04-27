package com.class24.demo;

public class EmployeeTester {
    public static void main(String[] args) {
       Employee employee=new Employee();
       employee.salary=100000;
       employee.getPaid();

       Contractor contractor=new Contractor();
       contractor.salary=50;
       contractor.getPaid();

       Employee employee1=new Contractor(); //widening upcasting
       Contractor constractor1=(Contractor) new Employee(); //narrowing downcasting
    }
}
