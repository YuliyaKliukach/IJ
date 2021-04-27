package com.class29;

import java.util.ArrayList;

public class HW01 {
    /*
    Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */

    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Yuliya");
        names.add("Olga");
        names.add("Maria");
        names.add("Anna");
        names.add("Kate");
        System.out.println("Array is empty, true or false: "+names.isEmpty());
        if(names.contains("Marta")){
                System.out.println("Specific name is present in Arraylist");
            }else{
            System.out.println("Specific name is not present in Arraylist");
        }

        System.out.println(names.size());
        System.out.println(names);

    }
}
