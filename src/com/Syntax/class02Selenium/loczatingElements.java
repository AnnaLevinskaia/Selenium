package com.Syntax.class02Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loczatingElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize(); //it is a best practice always maximize window
        driver.findElement(By.id("email")).sendKeys("Anna");
        driver.findElement(By.name("pass")).sendKeys("abc123");  //digest and space - name might be dinamic
        driver.findElement(By.name("login")).click();

        //driver.findElement(By.linkText("Forgot password?")).click();

        //driver.findElement(By.partialLinkText("Forgot")).click();

    }




}
