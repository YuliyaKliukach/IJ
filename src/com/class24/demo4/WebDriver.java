package com.class24.demo4;

public class WebDriver {
    void openWebsite(){
        System.out.println("Opening the website");
    }
    void closeWebsite(){
        System.out.println("Closing the website");
    }
    void loginWebsite(){
        System.out.println("Login the website");
    }
    void signupWebsite(){
        System.out.println("Sign up the website");
    }
    void downloadfromWebsite(){
        System.out.println("Download file from the website");
    }
}

class GoogleChrome extends WebDriver{
    void openWebsite(){
        System.out.println("Opening the website in Google Chrome");
    }
    void closeWebsite(){
        System.out.println("Closing the website in Google Chrome");
    }
    void loginWebsite(){
        System.out.println("Login the website in Google Chrome");
    }
    void signupWebsite(){
        System.out.println("Sign up the website in Google Chrome");
    }
    void downloadfromWebsite(){
        System.out.println("Download file from the website in Google Chrome");
    }
}

class Firefox extends WebDriver{
    void openWebsite(){
        System.out.println("Opening the website in Firefox");
    }
    void closeWebsite(){
        System.out.println("Closing the website in Firefox");
    }
    void loginWebsite(){
        System.out.println("Login the website in Firefox");
    }
    void signupWebsite(){
        System.out.println("Sign up the website in Firefox");
    }
    void downloadfromWebsite(){
        System.out.println("Download file from the website in Firefox");
    }
}
