package com.class27;

public class PhoneTestre {

    public static void main(String[] args) {
        Phone iphone=new Iphone();
        iphone.unlockPhone();

        Phone samsung=new Samsung();
        samsung.displayPictures();
        samsung.makeCalls();
    }
}
