package com.class19;

public class ConstructorDemo3 {

    String name;
    double salary;
    double bonus;
    int numOfDaysWorked;
    double bonusPercentage;

    ConstructorDemo3(String name, double salary, int numOfDaysWorked, double bonusPercentage){
        this.name=name;
        this.salary=salary;
        bonus=1000;
        this.numOfDaysWorked=numOfDaysWorked;
        this.bonusPercentage=bonusPercentage;
    }
    void printBonus(){
        if (numOfDaysWorked>=300){
            bonus=1000;
        }else{
            bonus=500;
        }
    }

    public static void main(String[] args) {
        ConstructorDemo3 ram=new ConstructorDemo3("Ram", 50000, 200, 100);
        ram.printBonus();
        System.out.println(ram.name);
        System.out.println(ram.salary);
        System.out.println(ram.numOfDaysWorked);
        System.out.println(ram.bonus);
        System.out.println(ram.bonusPercentage);

    }
}
