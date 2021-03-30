package com.class22.task1;

public class NamePhone {

    String name;
    String phone;

    public NamePhone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void userDetails(){
        System.out.println(name);
        System.out.println(phone);
    }
}
