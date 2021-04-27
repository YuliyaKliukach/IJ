package com.company.repls;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0; i<=5; i++){
            numbers.add(scan.nextInt());
        }
        for(int num:numbers){
            System.out.print(num+" ");
        }
    }
}