package com.Syntax.class07_Window_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        String gmailWinHandl=driver.getWindowHandle();
        //driver.manage().window().maximize();

        //click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        //click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        Set<String> windHandles = driver.getWindowHandles();
        for (String handle:windHandles
             ) {
            driver.switchTo().window(handle);
            String title=driver.getTitle(); //or we can use url
            if(title.equalsIgnoreCase("Google Account Help")){
                String helpHan=handle;
                System.out.println(title);
                break;
            }
        }

        WebElement communBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communBtn.click();


        driver.switchTo().window(gmailWinHandl);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));

        firstName.sendKeys("Anna");
    }

}
