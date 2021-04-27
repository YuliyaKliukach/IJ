package com.class31;

public abstract class Card {
    String creditCardType;

    public Card(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    abstract void calculateInterest();
    public void IssueCard(){
        System.out.println(creditCardType+" issued");
    }
}

class CreditCard extends Card{

    public CreditCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("Interest is 15 %");
    }
}

class DebitCard extends Card{

    public DebitCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("Interest is 1 %");
    }
}
class PrepaidCard extends Card{

    public PrepaidCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("Mast pay all the money before hand");
    }
}
