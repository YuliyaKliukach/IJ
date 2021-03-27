package com.class17;

public class Students {
    String studentName;
    String studentID;
    int numberOfStudents;

    public static void main(String[] args) {
        Students stu1= new Students();
        stu1.studentName="Yuliya";
        stu1.studentID="123456";

        Students stu2= new Students();
        stu2.studentName="Alex";
        stu2.studentID="123457";

        Students stu3= new Students();
        stu3.studentName="Max";
        stu3.studentID="123458";

        Students []student=new Students[3];
        student[0]=stu1;
        student[1]=stu2;
        student[2]=stu3;

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].studentName+" with ID "+student[i].studentID);
        }
        System.out.println("We have "+student.length+" students");

    }
}
