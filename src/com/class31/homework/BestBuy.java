package com.class31.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BestBuy {
    /*
    Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */

    public static <MapEntry> void main(String[] args) {
        HashMap<String, String> bestBuyItem=new HashMap<>();
        bestBuyItem.put("123456", "Laptop");
        bestBuyItem.put("123457", "TV");
        bestBuyItem.put("123459", "Smartphone");
        bestBuyItem.put("123450", "Smartwatch");
        bestBuyItem.put("123451", "Keyboard");
        bestBuyItem.put("123452", "Kettle");

        Set<Map.Entry<String, String>> mapKeys=bestBuyItem.entrySet();
        for (Map.Entry map:mapKeys
             ) {
            System.out.println(map);
        }
        System.out.println("-----------------------------------------");

        Iterator<Map.Entry<String, String>> entryIterator=bestBuyItem.entrySet().iterator();
        while(entryIterator.hasNext()){
            System.out.println(entryIterator.next());
        }
    }

}
