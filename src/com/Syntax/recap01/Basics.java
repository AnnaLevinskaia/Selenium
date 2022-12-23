package com.Syntax.recap01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        //setting up the WebDriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //create an instance
        WebDriver driver = new ChromeDriver();
        //open the facebook
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anna");
        Thread.sleep(2000); //to load window, no more then 3 sec

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Levinskaia");
        driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png')]")).click();

        Thread.sleep(2000); //just to watch
        driver.quit(); //- close all windows and all tabs
        //driver.close -close only this particular tab
        //get(we cant move forward and back) and navigate(regresh+forward+back)

    }
}
