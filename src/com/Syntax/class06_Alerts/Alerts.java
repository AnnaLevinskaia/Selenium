package com.Syntax.class06_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        //driver.manage().window().maximize();

        //find the button click on me
        WebElement simpleAlert=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        Thread.sleep(2000);

        //handling the alert --close on ok(accept it)
        Alert simpleAlert1 = driver.switchTo().alert();
        simpleAlert1.accept();
        Thread.sleep(2000);

        //find the button for configuration alert and click
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();
        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.dismiss(); //we can do dismiss or accept because alert has 2 button - ok and cansel

        //find the prompt alert and send text than acept it
        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptAlert.click();
        Thread.sleep(2000);

        //switch the focus to the alert
        Alert propm1 = driver.switchTo().alert();
        propm1.sendKeys("abrraa");
        propm1.accept();


    }
}
