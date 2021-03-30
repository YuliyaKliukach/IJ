package com.class23;

public class Bank {

    void chargeTransferFee(double amount){
        System.out.println("Your fee is "+amount*0.002);
    }
}

class BankOfAmerica extends Bank{
    void chargeTransferFee(double amount){
        System.out.println("Your fee is "+amount*0.005);
    }
}

class Chase extends Bank{
    void chargeTransferFee(double amount){
        System.out.println("Your fee is "+amount*0.003);
    }
}
class Citizen extends Bank{

}
