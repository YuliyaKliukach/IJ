package com.whatIdobymyself;

public class Tester {
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo=new EncapsulationDemo();
        encapsulationDemo.setName("Sumair");
        encapsulationDemo.setAcc_no("7560504000");
        encapsulationDemo.setEmail("sumair@syntax.com");
        encapsulationDemo.setAmount(50000);
        System.out.println(encapsulationDemo.getAcc_no()+" "+encapsulationDemo.getName()+" "+encapsulationDemo.getEmail()+" "+ encapsulationDemo.getAmount());
    }
}
