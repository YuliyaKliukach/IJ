package com.class29;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String>subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        System.out.println(subjects.get(2));
        System.out.println(subjects.indexOf("Java"));
    }
}
