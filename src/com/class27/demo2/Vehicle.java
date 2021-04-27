package com.class27.demo2;

public abstract class Vehicle<abstarct> {

    String vinNumber;
    static int totalVehicle;

    public Vehicle(String vinNumber) {
        totalVehicle++;
        this.vinNumber = vinNumber;
    }

    public void totalVehiclesCreated(){
        System.out.println("we build "+totalVehicle);
    }

    public void drive(){
        System.out.println("Vehicle can drive");
    }

    public void stop(){
        System.out.println("Vehicle can stop");
    }

    public abstract void start();
}
    abstract class Car extends Vehicle{
        String carType;
    Car(String vinNumber, String carType){
        super(vinNumber);
        this.carType=carType;
        }

        public void drive(){
            System.out.println("Car can drive");
        }
        public abstract void speed();
 }

 class BMW extends Car{
        String make;
        String model;

     BMW(String vinNumber, String carType, String make, String model) {
         super(vinNumber, carType);
         this.make=make;
         this.model=model;
     }

     @Override
     public void start() {
         System.out.println("BMW can start with remote");
     }

     @Override
     public void speed() {
         System.out.println("BMW can go max speed 300 K/H");
     }
     public void display(){
         System.out.println("We build "+make+" Model "+model+" "+carType+" "+vinNumber);
     }
 }
 class Toyota extends Car{

    String make;
    String model;
     Toyota(String vinNumber, String carType, String make, String model) {
         super(vinNumber, carType);
         this.make=make;
         this.model=model;
     }

     @Override
     public void start() {
         System.out.println("Toyota can also start with remote");
     }

     @Override
     public void speed() {
         System.out.println("Toyota can go up to 200 KM/H");
     }

     void display(){
         System.out.println("We build "+make+" Model "+model+" "+carType+" "+vinNumber);
     }
 }