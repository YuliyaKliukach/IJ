package com.class18;

import org.jetbrains.annotations.NotNull;

public class Account {

    public double accountBalance;
    private String userName;
    private String password;

    public boolean login(String enteredUserName, String enteredPassword) {
        return (enteredUserName.equals(userName) && enteredPassword.equals(password));
    }

    public boolean signUp(String enteredUserName, String enteredPassword, double enteredBallance) {
        if(enteredUserName.length()>15){
            return false;
        }else{
            userName=enteredUserName;
            password=enteredPassword;
            accountBalance=enteredBallance;
            return true;
        }
    }

    boolean transferFunds(String userName, double enteredBallance){
        if(password.equals("123456") && enteredBallance<=accountBalance){
            return true;
        }else{
            return false;
        }

    }
}
