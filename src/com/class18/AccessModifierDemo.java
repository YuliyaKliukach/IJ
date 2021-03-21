package com.class18;

public class AccessModifierDemo {

    public String name;
    private String bankAccountPassword;
    private String  ssnNumber;

    public void park(){
        System.out.println("Everyone can go to a public park");
    }
    void car(){
        System.out.println("My husband can use my car");
    }
    private void toothBrush(){
        System.out.println("No one should use it");
    }

    void printInfo(){
        System.out.println(name);
        System.out.println(bankAccountPassword);
        System.out.println(ssnNumber);
        toothBrush();

    }

}
