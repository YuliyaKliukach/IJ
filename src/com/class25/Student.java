package com.class25;

public class Student{
    void study(){
        System.out.println("All students are studying");
    }
}
class SyntaxStudent extends Student{
    @Override
    void study() {
        System.out.println("Syntax Students are studying in Syntax");
    }

    void learnJava(){
        System.out.println("Syntax students learn Java");
    }
}
class CollegeStudent extends Student{
    void study() {
        System.out.println("College Students are studying in a college");
    }
    void learnMath(){
        System.out.println("College students learn Math");
    }
}
class SchoolStudent extends Student{
    void study() {
        System.out.println("School Students are studying in a school");
    }
    void learnSubjects(){
        System.out.println("School students learn different Subjects");
    }
}
