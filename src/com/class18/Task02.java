package com.class18;

public class Task02 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */

    public static String rev="Syntax";

    public String strRev(String rev){
        return rev;
    }

    public static void main(String[] args) {
        Task02 task2=new Task02();
        StringBuilder rev1=new StringBuilder("Syntax");
        rev1.reverse();
        task2.rev=rev1.toString();
        System.out.println(task2.rev);
    }
}
