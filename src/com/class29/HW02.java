package com.class29;

import java.util.ArrayList;

public class HW02 {
    /*
    Create an arraylist of cars and retrieve all the values using 3 different ways.
     */
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        String c="BMW";
        cars.add("Toyota");
        cars.add(1, "Volvo");
        cars.add(c);
        System.out.println(cars);


    }
}
