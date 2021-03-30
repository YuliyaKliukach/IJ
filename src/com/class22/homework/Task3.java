package com.class22.homework;

public class Task3 {

    static void printInfo(String name){
        System.out.println(name);
    }

    static void printInfo(String name, String address){
        System.out.println(name+" "+address);
    }

    static void printInfo(String name, String address, String phoneNumber){
        System.out.println(name+" "+address+" "+phoneNumber);
    }

    public static void main(String[] args) {
        printInfo("Yuliya");
        printInfo("Yuliya", "Philly");
        printInfo("Yuliya", "Philly", "123456799");
    }
}
