package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class HW05 {
    /*
    Create an arrayList of even numbers from 1 to 50.
    Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0; i<=50; i++){
            if(i%2==0){
                numbers.add(i);
            }
        }
        System.out.println(numbers);

        Iterator<Integer> number=numbers.iterator();

        while(number.hasNext()){
            Integer num=number.next();
            if(num%5==0){
                number.remove();
            }
        }

        System.out.println(numbers);
    }

}
