package com.class29;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");
        System.out.println(subjects);

        ArrayList<String> subjectsWeWantToRemove=new ArrayList<>();
        subjectsWeWantToRemove.add("SDLC");
        subjectsWeWantToRemove.add("Manual Testing");
        subjectsWeWantToRemove.add("Java");

        subjects.removeAll(subjectsWeWantToRemove);
        System.out.println(subjects);
    }
}
