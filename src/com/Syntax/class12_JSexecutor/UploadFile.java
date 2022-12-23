package com.Syntax.class12_JSexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadFile {
    //upload file
    public static void main(String[] args) {
        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/upload");
        //driver.manage().window().maximize();

        WebElement choosefile = driver.findElement(By.xpath("//input[@id='file-upload']"));
        //choosefile.sendKeys("C:\Users\moazzam\Desktop\abc.txt"); provide files path



    }
}
