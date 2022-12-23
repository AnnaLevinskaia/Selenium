package com.Syntax.class07_Window_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleAdvance {
    public static void main(String[] args) {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("http://accounts.google.com/signup");

        //driver.manage().window().maximize();

        //click on Help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        //click on privacy btn
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        //go to help page
        //title of my desired page-- <title>Google Account Help</title>
        Set<String> allHandles = driver.getWindowHandles();

        for (String handle:allHandles) {
            driver.switchTo().window(handle);   //switch focus to current handle, we dont know window

            String title=driver.getTitle(); //we know the page know
            if(title.equalsIgnoreCase("Google Account Help")){ //compare
              String helpHandle=handle;
                System.out.println("The current page under focus is: "+title);
                break;
            }
        }

        //find community button and click
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();






    }
}
