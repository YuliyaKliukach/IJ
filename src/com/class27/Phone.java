package com.class27;

abstract class Phone{
    void makeCalls(){
        System.out.println("Calling");
    }

    void sendText(){
        System.out.println("Texting");
    }
    abstract void displayPictures();

    abstract void unlockPhone();
}

class Iphone extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Iphone uses Photo app to display pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Iphone users can unlock phone by faceID");
    }
}

class Samsung extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Samsung users can see photos with Gallery app");
    }

    @Override
    void unlockPhone() {
        System.out.println("Samsung could be unlocked with fingerprint or faceID");
    }
}
