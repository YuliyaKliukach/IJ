package com.class28.encapsulation;

public class Person {

    String name;
    String bankAccountNumber;
    String address;
    String SSN;

    void setName(String name){
        if(name.length()<15){
            if(name.matches("[a-zA-z]*$")){
                this.name=name;
            }else{
                System.out.println("Only letters are allowed");
            }
        }else{
            System.out.println("Not more then 15 characters are allowed");
        }
    }
    String getName(){
        return name;
    }
}
