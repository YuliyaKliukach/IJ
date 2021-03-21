package com.class18;

public class TypesOfVars {

    String name;
    static String companyName="Syntax";
    void printInfo(){
        System.out.println(name+" Company "+companyName);
    }

    static void printCompanyInfo(){
        System.out.println(companyName);
    }

    public static void main(String[] args) {

        TypesOfVars obj1=new TypesOfVars();
        obj1.name="Ram";

        TypesOfVars obj2=new TypesOfVars();
        obj2.name="Aiman";

        TypesOfVars.printCompanyInfo();

    }
}
