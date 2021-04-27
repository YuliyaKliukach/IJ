package com.class30;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {
        Set<String> names=new TreeSet<>();
        names.add("Afzal");
        names.add("Gul");
        names.add("Yarina");
        names.add("Caner");
        names.add("TY");
        names.add("Gul");
        System.out.println(names);

        for (String name:names
             ) {
            System.out.println(name);
        }
    }
}
