package com.class22;

public class SuperAndStatic {

    String color;

    static void printInfo(){
        //System.out.println(color);
    }

    public static void main(String[] args) {
        SuperAndStatic superAndStatic=new SuperAndStatic();
        superAndStatic.color="Red";
        SuperAndStatic superAndStatic1=new SuperAndStatic();
        superAndStatic1.color="White";
        SuperAndStatic superAndStatic2=new SuperAndStatic();
        superAndStatic2.color="Black";
        SuperAndStatic.printInfo();
    }

}
class parent{
    String color;
}
