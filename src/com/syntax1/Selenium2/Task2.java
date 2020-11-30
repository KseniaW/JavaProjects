package com.syntax1.Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\17573\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Thread.sleep(1000);
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String title = driver.getTitle();
        Thread.sleep(1000);
        System.out.println(title);
        if (title.equalsIgnoreCase("web orders")) {
            System.out.println("Title is right");
        }else{
            System.out.println("Title is wrong");
        }
       driver.findElement(By.id("ctl00_logout")).click();
        Thread.sleep(1000);
       driver.quit();
    }
}