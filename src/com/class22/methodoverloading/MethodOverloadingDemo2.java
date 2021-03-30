package com.class22.methodoverloading;

public class MethodOverloadingDemo2 {

    void add(int a, int b){
        System.out.println(a+b);
    }

    void add(double a, double b){
        System.out.println(a+b);
    }
    void add(double a, int b, int c){
        System.out.println(a+b+c);
    }

    void add(int ... arr){
        int sum=0;
        for (int num:arr) {
            sum+=num;
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 ob1=new MethodOverloadingDemo2();
        ob1.add(1,2);
        ob1.add(10.0,20.0);
        ob1.add(10.0,10, 10);
        int[]arr={10,20,30};
        ob1.add(arr);
        ob1.add(10,20,30,40,50,60,70);
    }
}
