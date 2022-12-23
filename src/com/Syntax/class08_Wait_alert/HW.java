package com.Syntax.class08_Wait_alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW
{
    public static void main(String[] args) {

            //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver(); //create a webdriver instance

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
            //driver.manage().window().maximize();


    }
}
