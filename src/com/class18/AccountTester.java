package com.class18;

import java.util.Scanner;

public class AccountTester {
    public static void main(String[] args) {
        Account account=new Account();
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("Enter 1 for signup / 2 for login / 3 for transfer / 4 to exit program");
            int input=scanner.nextInt();
            if (input==4) {
                break;
            }else if(input==3){
                System.out.println("Enter the amount you want to transfer");
                double amount=scanner.nextDouble();
                System.out.println("Please reenter your password");
                String pass= scanner.next();
                account.transferFunds(pass, amount);
            }else if(input==2){
                System.out.println("Welcome to Bank app. Please enter your username and password");
                String username= scanner.next();
                String pass=scanner.next();
                account.login(username, pass);
            }else if (input==1){
                System.out.println("Enter your username, password and amount for deposit");
                account.signUp(scanner.next(), scanner.next(), scanner.nextDouble());
            }

        }
    }
}
