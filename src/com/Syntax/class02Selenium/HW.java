package com.Syntax.class02Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//fill out the form
//click on register
//close the browser
public class HW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Anna");
        driver.findElement(By.id("customer.lastName")).sendKeys("Levinskaia");
        driver.findElement(By.id("customer.address.street")).sendKeys("73 rd street");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.city")).sendKeys("North Bergen");
        driver.findElement(By.id("customer.address.state")).sendKeys("NJ");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("07047");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("111-222-33-44");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.username")).sendKeys("AnnaLev");
        driver.findElement(By.id("customer.password")).sendKeys("Anna123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Anna123");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();
        driver.close();
    }
}
