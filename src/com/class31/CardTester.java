package com.class31;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        LinkedList<Card> linkedList=new LinkedList<>();
        linkedList.add(new CreditCard("Visa"));
        linkedList.add(new DebitCard("MasterCard"));
        linkedList.add(new PrepaidCard("American Express"));
        for(Card card: linkedList){
            card.IssueCard();
            card.calculateInterest();
        }
    }
}
