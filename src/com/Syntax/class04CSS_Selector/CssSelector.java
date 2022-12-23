package com.Syntax.class04CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-first-form-demo.php");
        driver.manage().window().maximize();

        //driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("Abrakadabra");
        //another method of doing line 15
        WebElement textBox=driver.findElement(By.cssSelector("input[placeholder*='Please enter']")); //return type of right path is web element
        textBox.sendKeys("Hello Guys!"); //code more readable, presentable; we can use more technics

        WebElement button =driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        Thread.sleep(2000);
        button.click();





    }
}
