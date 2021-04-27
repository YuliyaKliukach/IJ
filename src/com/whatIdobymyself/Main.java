package com.whatIdobymyself;

public class Main implements Functions{
    double result;
    public void display(double result){
        System.out.println("Result is ::: "+result);
    }
    public double adding(double firstNumber, double secondNumber){
        return result=firstNumber+secondNumber;
    }
    public double subtracting(double firstNumber, double secondNumber){
        return result=firstNumber-secondNumber;
    }
    public double multiply(double firstNumber, double secondNumber){
        return result=firstNumber*secondNumber;
    }
    public double dividing(double firstNumber, double secondNumber){
        return result=firstNumber/secondNumber;
    }

    public static void main(String[]args){
        Functions fun=new Main();
        double firstNumber = 100.00;
        double secondNumber = 20.00;

        fun.display(fun.subtracting(firstNumber, secondNumber));
    }
}
interface Outputs{

    public void display(double result);
}
interface Functions extends Outputs{
    public double adding(double firstNumber, double secondNumber);
    public double subtracting(double firstNumber, double secondNumber);
    public double multiply(double firstNumber, double secondNumber);
    public double dividing(double firstNumber, double secondNumber);
}