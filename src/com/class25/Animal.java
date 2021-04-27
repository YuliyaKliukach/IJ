package com.class25;

import com.class21.A;

public class Animal {
    void eat(){
        System.out.println("Animals can eat");
    }

    void sleep(){
        System.out.println("Animals can sleep");
    }
}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dogs like meat");
    }
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("Cat is meowing");
    }
}