package com.class18;

public class Task02var2 {

    public static String reverseString(String str){
        String str2="";
        for (int i = str.length()-1; i >=0; i--) {
            str2+=str.charAt(i);
        }
        return str2;
    }

    public static void main(String[] args) {
        System.out.println(Task02var2.reverseString("Milk"));
    }
}
