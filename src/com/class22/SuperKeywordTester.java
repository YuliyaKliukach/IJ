package com.class22;
public class SuperKeywordTester extends SuperKeywordDemo{

        String color="Red";

        void printColor(){
        System.out.println("Child class "+this.color);
        System.out.println("Parent class "+super.color);
    }

    void print5times(boolean shouldCallParent){

            if(shouldCallParent){
                super.printColor();
            }else{
                this.printColor();
            }

    }
}
