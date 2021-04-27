package com.class28;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] webDriver= {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver web:webDriver
             ) {
            web.closeBrowser();
            web.findElement();
            web.maximizeWindow();
            web.openBrowser();
        }
    }
}
