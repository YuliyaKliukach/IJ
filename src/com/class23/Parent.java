package com.class23;

public class Parent {

    public void print(){
        System.out.println("lol");
    }

    static class Child extends Parent{
        public void print(){
            System.out.println("lol lol");
        }
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.print();
    }
}
