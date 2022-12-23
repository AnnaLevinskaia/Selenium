package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Anyaa_dms@mail.ru");

        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(@type,'subm')]"));
        driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click(); //forgotten password
      //  driver.findElement(By.xpath("//input[starts-with(@name,'pa')]")).sendKeys("123"); //password

    }
}

