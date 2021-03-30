package com.class22.task2;

public class Circle extends Shape{
    double area=0;

    public Circle(double radius) {
        super(radius);
    }

    void areaOfCircle(){
        System.out.println("Area of circle equals to "+(area=radius*radius*Math.PI));
    }
}
