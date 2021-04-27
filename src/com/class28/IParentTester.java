package com.class28;

public class IParentTester {
    public static void main(String[] args) {
        //IParent iParent=new IParent();
        IParent iParent=new AdvanceChild();
        iParent.method1();
    }
}
