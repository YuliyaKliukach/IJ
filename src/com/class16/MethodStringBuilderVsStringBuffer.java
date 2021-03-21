package com.class16;

public class MethodStringBuilderVsStringBuffer {
    public static void main(String[] args) {
        String var1="Meerim";
        String var2="Aziz";
        String var3="Afzal";
        String var4="MJ"; //recommend

        String var5=new String("Angelo"); //not recommend

        var4="Ram";

        StringBuilder sb1=new StringBuilder("Meerim");
        StringBuilder sb2=new StringBuilder("Aziz");
        StringBuilder sb3=new StringBuilder("Afzal");
        StringBuilder sb4=new StringBuilder("MJ");

        System.out.println(sb1.reverse());

        var1=sb1.toString();
        System.out.println(var1);
    }
}
