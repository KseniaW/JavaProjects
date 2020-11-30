package com.syntax1.Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\17573\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
driver.findElement(By.name("customer.firstName")).sendKeys("Ksenia");
driver.findElement(By.name("customer.lastName")).sendKeys("White");
driver.findElement(By.name("customer.address.street")).sendKeys("3 North Lane");
driver.findElement(By.name("customer.address.city")).sendKeys("VB");
driver.findElement(By.name("customer.address.state")).sendKeys("Virginia");
  driver.findElement(By.name("customer.address.zipCode")).sendKeys("11234");
  driver.findElement(By.name("customer.phoneNumber")).sendKeys("123567890");
  driver.findElement(By.name("customer.ssn")).sendKeys("099-345-0900");
  driver.findElement(By.name("customer.username")).sendKeys("Kay");
  driver.findElement(By.name("customer.password")).sendKeys("12345");
  driver.findElement(By.name("repeatedPassword")).sendKeys("12345");
 Thread.sleep(2000);
  driver.findElement(By.className("button")).click();
  Thread.sleep(2000);
  driver.quit();
    }
}