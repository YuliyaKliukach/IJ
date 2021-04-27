package com.class25;

public class Task1Tester {
    public static void main(String[] args) {
        Student student=new CollegeStudent();
        student.study();
        Student student1=new SchoolStudent();
        student1.study();

        CollegeStudent collegeStudent=new CollegeStudent();
        collegeStudent.learnMath();

        SyntaxStudent syntaxStudent=new SyntaxStudent();
        syntaxStudent.learnJava();

        SchoolStudent schoolStudent=new SchoolStudent();
        schoolStudent.learnSubjects();

    }
}
