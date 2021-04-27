package com.class24.demo4;

public class WebsiteTester {
    public static void main(String[] args) {
        WebDriver webDriver=new GoogleChrome();
        webDriver.openWebsite();
        webDriver.downloadfromWebsite();
        webDriver.closeWebsite();
        webDriver.loginWebsite();

        WebDriver [] webDrivers={new GoogleChrome(), new Firefox()};

        for (WebDriver webDriver1:webDrivers){
            webDriver1.openWebsite();
            webDriver1.downloadfromWebsite();
            webDriver1.closeWebsite();
            webDriver1.loginWebsite();

        }


    }
}
