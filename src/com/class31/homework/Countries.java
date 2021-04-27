package com.class31.homework;

import java.util.*;

public class Countries {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        Map<String, String> countries=new TreeMap<>();
        countries.put("Belarus", "Minsk");
        countries.put("USA", "Washington, DC");
        countries.put("Germany", "Berlin");
        countries.put("France", "Paris");
        countries.put("Poland", "Warsaw");
        countries.put("Spain", "Madrid");
        Set<String> mapKeys=countries.keySet();
        for (String key:mapKeys
             ) {
            System.out.println(key+" "+countries.get(key));
        }

        Iterator<String > iterator=mapKeys.iterator();
        while (iterator.hasNext()){
            String country=iterator.next();
            System.out.println(country+" "+countries.get(country));
        }

        Collection<String> mapValues= countries.values();
        for(String city:mapValues){
            System.out.println(city);
        }

        Iterator<String> iterator1=mapValues.iterator();
        while (iterator1.hasNext()){
            String city=iterator1.next();
            System.out.println(city);
        }

    }
}
