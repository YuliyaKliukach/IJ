package com.whatIdobymyself;

public class Test {

    public static String alphabetical(String str) {
        char[] arr = str.toCharArray();
        String str2="";
        for (int i = 0; i < arr.length; i++) {
            char a=arr[i];
            if (a >'a' && a<arr[i++]) {
                str2=str.replaceAll(String.valueOf(a), "");
            }

        }

        return str2;
    }

        //test case below (dont change):
        public static void main (String[]args){
            System.out.println(alphabetical("hello")); //"hlo"
            System.out.println(alphabetical("software"));
            System.out.println(alphabetical("language"));
        }
    }





