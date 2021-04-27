package com.class28.encapsulation;

import com.class21.B;

public class BankTester {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("Yuliya", "abc", "123456", 1000);
        bankAccount.login("abc", "123456");
       // bankAccount.password="452621";
        System.out.println(bankAccount.getBalance("abc", "123456"));

    }
}
