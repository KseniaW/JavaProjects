package com.syntax1.SeLeniUm;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\17573\\Desktop\\chromedriver.exe");
    //chromedriver.exe for windows, none for mac
        //also you can use \\

        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxtechs.com/");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title =driver.getTitle();
        System.out.println(title);
    }
}
