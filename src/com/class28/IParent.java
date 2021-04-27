package com.class28;

public interface IParent {
    int num2=20;

    void method1();
}

interface IParent2{
    void method2();
}

class AdvanceChild implements IParent, IParent2{

    @Override
    public void method1() {
        System.out.println("from IParent");
    }

    @Override
    public void method2() {
        System.out.println("from IParent2");
    }
}