package com.class31;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String, Double> groceries=new LinkedHashMap<>();
        groceries.put("eggs", 12.00);
        groceries.put("milk", 15.0);
        groceries.put("tomato", 35.0);
        groceries.put("potato", 10.0);

        Set<Map.Entry<String, Double>> entrySet=groceries.entrySet();

    }
}
