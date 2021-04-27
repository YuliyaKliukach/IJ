package com.class28;

public class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Firefox opens");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Firefox closes");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Window in Firefox is maximized");
    }
    @Override
    public void findElement() {
        System.out.println("Element in Firefox is founded");
    }
}
