package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Navigate to http://syntaxprojects.com/
//Click on start practicing
// click on simple form demo
//enter any text on first text box
//click on show message
//quit the browser
public class Practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
      //  driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();

        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]")).click();
      //driver.findElement(By.xpath("//a[starts-with(@class, 'list')]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("We are still alive!");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        driver.quit();
    }
}
