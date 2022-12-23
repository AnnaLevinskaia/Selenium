package com.Syntax.class07_Window_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public interface HW2 {
    public static void main(String[] args) {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        String gmailWinHandl=driver.getWindowHandle();
        //driver.manage().window().maximize();


        WebElement getNewUserBtn = driver.findElement(By.xpath("//button[text()='Get New User']"));

        getNewUserBtn.click();
        //WebElement firstName = driver.findElement(By.xpath("//div[@id='First-Name']"));
        WebElement firstName = driver.findElement(By.cssSelector("div#First-Name"));

        String textFirstName = firstName.getText();
        System.out.println("Name is" +textFirstName);
    }

}
