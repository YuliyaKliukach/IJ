package com.class29;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        System.out.println(subjects.contains("SDLC"));
        System.out.println(subjects.contains("Selenium"));
    }
}
