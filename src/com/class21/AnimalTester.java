package com.class21;

public class AnimalTester {

    public static void main(String[] args) {
        Dog dog1=new Dog("Jacky");
        dog1.bark();
        dog1.sleep();
        dog1.run();

        Cat cat1=new Cat("Tom");
        cat1.meow();
        cat1.run();
        cat1.sleep();
        cat1.eat();
    }
}
