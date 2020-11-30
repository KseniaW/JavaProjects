package com.syntax1.Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\17573\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://facebook.com");
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Ksenia");
        driver.findElement(By.name("lastname")).sendKeys("White");
        driver.findElement(By.name("reg_email__")).sendKeys("fghj@yahoo.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("fghj@yahoo.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_s")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("u_1_9")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
