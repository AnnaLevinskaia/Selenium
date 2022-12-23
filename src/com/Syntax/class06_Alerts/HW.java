package com.Syntax.class06_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*    HW:goto https://chercher.tech/practice/frames1.check
the checkBox2.Select BabyCat from drop dwon3. Send text in text box "DONE"     */
public class HW {
    public static void main(String[] args) throws InterruptedException {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();

        //switch to the frame using by index
        driver.switchTo().frame(1);

        //find the web element that contains the select class
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='animals']"));
        Select select=new Select(dropDown);
        //Select BabyCat from drop down
        select.selectByVisibleText("Baby Cat");

        //send text in text button "Done"
        driver.switchTo().defaultContent();

        //send text in text button "Done"
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//input")).sendKeys("Done");





    }
}
