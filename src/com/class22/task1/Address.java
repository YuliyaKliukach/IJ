package com.class22.task1;

public class Address extends NamePhone{
    String address;
    public Address(String name, String phone) {
        super(name, phone);
    }

    void userDetails(){
        super.userDetails();
        System.out.println(address);
    }
}
