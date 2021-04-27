package com.class31;

public abstract class Insurance {
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public abstract void getQuote();

    public abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quote for a car model "+carModel+" with "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance "+insuranceName+" for car model "+carModel);
    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quote for a pet "+petType+" with "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance "+insuranceName+" for pet "+petType);
    }
}

class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quote with "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance "+insuranceName);
    }
}