package com.class19;

public class Students {
    /*
    Write a java program of Class Students that takes students name
    and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.
     */

    String name;
    double mark1;
    double mark2;
    double mark3;
    double average;

    char grade;

    Students(String name, double mark1, double mark2, double mark3){
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    void setGrade(){
        average=(mark1+mark2+mark3)/3;

        if(average>90){
            grade='A';
        }else if(average<=90&&average>80){
            grade='B';
        }else if(average<=80&&average>70){
            grade='C';
        }else if(average<=70&&average>60){
            grade='D';
        }else if(average<=60&&average>50){
            grade='E';
        }else{
            grade='F';
        }
    }

    public static void main(String[] args) {
        Students student1=new Students("Yuliya", 100, 95, 90);
        student1.setGrade();
        System.out.println(student1.name+" has grade "+student1.grade);

        Students student2=new Students("Max", 92, 70, 89);
        student2.setGrade();
        System.out.println(student2.name+" has grade "+student2.grade);

        Students student3=new Students("Mira", 25, 26, 50);
        student3.setGrade();
        System.out.println(student3.name+" has grade "+student3.grade);

        Students student4=new Students("Mark", 50, 56, 70);
        student4.setGrade();
        System.out.println(student4.name+" has grade "+student4.grade);

        Students student5=new Students("Masha", 77, 70, 68);
        student5.setGrade();
        System.out.println(student5.name+" has grade "+student5.grade);
    }
}
