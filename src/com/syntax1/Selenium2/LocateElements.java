package com.syntax1.Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocateElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\17573\\Desktop\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("syntax");
    driver.findElement(By.id("pass")).sendKeys("syntax123");
    driver.findElement(By.name("login") ).click();
    Thread.sleep(2000);
    //driver.findElement(By.linkText("Forgot Password?")).click();
    driver.findElement(By.partialLinkText("Forgot")).click();
    Thread.sleep(2000);
    driver.quit();
    }
}
