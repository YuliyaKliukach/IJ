package com.class29;

import com.class21.A;

import java.util.ArrayList;
import java.util.Collections;

public class HW03 {
    /*
    Create an arrayList of words. Remove every word that ends with “e”.
     */
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("orange");
        words.add("banana");
        words.add("tomato");
        words.add("mango");

        for (int i = words.size()-1; i >=0; i--) {
            if (words.get(i).endsWith("e")) {
                words.remove(words.get(i));
            }
        }
            System.out.println(words);


    }
}
