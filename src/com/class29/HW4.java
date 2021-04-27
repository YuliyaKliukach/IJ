package com.class29;

import java.util.ArrayList;

public class HW4 {
    /*
    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

     */

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("fanta");
        drinks.add("juice");
        drinks.add("beer");
        drinks.add("sprite");
        drinks.add("cola");
        drinks.add("soda");

        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("e") || drinks.get(i).contains("a")) {
                drinks.set(i, "water");

            }
        }
        System.out.println(drinks);
    }
}
