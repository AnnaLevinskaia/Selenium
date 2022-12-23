package com.Syntax.class12_JSexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JsExecutorHighLight {
    public static void main(String[] args) {
        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //driver.manage().window().maximize();

        driver.findElement(By.linkText("Continue anyway")).click();

        // find the webEelment username
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        //  using js Executor
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px dotted blue'",username);


    }
}
