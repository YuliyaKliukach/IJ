package com.class28;

public class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Chrome opens"); }
    @Override
    public void closeBrowser() {
        System.out.println("Chrome closes");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Window in Chrome is maximized"); }
    @Override
    public void findElement() {
        System.out.println("Element in Chrome is founded");
    }
}
