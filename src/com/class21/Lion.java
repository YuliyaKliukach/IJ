package com.class21;

public class Lion extends Animal{
    Lion(String name){
        this.name=name;
    }
    void run(){
        System.out.println(name+" is running");
    }

    void walk(){
        System.out.println(name+" is walking");
    }

    void roar(){
        System.out.println(name+" is roaring");
    }
}

