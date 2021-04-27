package com.class32;

import java.util.TreeMap;

public class Task01 {
    public static void main(String[] args) {
        TreeMap<Integer, String> building=new TreeMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(1, "Google");
        building.put(3, "Google");
        building.put(1, "IBM");
        building.put(4, "Apple");
        building.put(10, "Amazon");
        System.out.println(building.get(1));
        System.out.println(building);
        building.replace(4, "Microsoft");
        System.out.println(building);

    }
}
