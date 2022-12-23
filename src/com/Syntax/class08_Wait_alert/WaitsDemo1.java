package com.Syntax.class08_Wait_alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitsDemo1 {
    public static void main(String[] args) {

            //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver(); //create a webdriver instance

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
            //driver.manage().window().maximize();

        //        click on the button that pops up the alert
        WebElement button1 = driver.findElement(By.xpath("//button[@id='alert']"));
        button1.click();
        //becuase we dont have a webElement associated with the alert in the DOM
//        so there is no purpose of using implicit wait (whihc waits for the webElement to be found)
//     so we use explicit wait in this scenarios

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());
        //handle the aiert
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();





    }
}
