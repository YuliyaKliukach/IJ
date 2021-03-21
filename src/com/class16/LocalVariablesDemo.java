package com.class16;

public class LocalVariablesDemo {

    void printInfo(String name) {
        String phoneNumber = "123456789";
        System.out.println(name);
    }

    void printInfoWithAddress(String name, String address) {
        System.out.println(name + address);
        //System.out.println(phoneNumber); //we cant call this method - its local for other method
    }

    public static void main(String[] args) {
        String name = "Local";
        System.out.println(name);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        {
            int x = 10;
            {
                int y = 20;
                System.out.println(x); //possible to use on such way
            }
            // System.out.println(y); //cant be used - outside {}
        }
    }
}
