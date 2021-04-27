package com.whatIdobymyself;

public class Main2 {

    public static void main(String[]args){
       Animal[] arr={new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"),new Kitten3("kitten3")};
        print(arr);
    }
    static void print(Animal[] arr){
        for(Animal cat:arr){
            System.out.println(cat.name+" "+cat.eat());
            System.out.println(cat.name+" "+cat.sleep());
        }
    }
}
class Animal{

    public String name;
    Animal(String name){
        this.name=name;
    }

    String eat(){
        return "eats";
    }
    String sleep(){
        return "sleeps";
    }
}

class Cat extends Animal{
    String name;
    Cat(String name) {
        super(name);
    }
    String sleep(){
        return "sleeps a lot";
    }
}
class Kitten1 extends Cat{
    Kitten1(String name){
        super(name);
    }
    String eat(){
        return "eats milk";
    }
}
class Kitten2 extends Cat{
    Kitten2(String name){
        super(name);
    }
    String eat(){
        return "eats snack";
    }
}
class Kitten3 extends Cat{
    Kitten3(String name){
        super(name);
    }
    String eat(){
        return "eats everything";
    }
}

