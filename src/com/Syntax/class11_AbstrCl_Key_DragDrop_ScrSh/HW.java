package com.Syntax.class11_AbstrCl_Key_DragDrop_ScrSh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HW {

/*    right click  on the button, select edit and handle the alert
    double click on the button and handle the alert*/

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        //driver.manage().window().maximize();

        //right click
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions act=new Actions(driver);
        act.contextClick(rightClickBtn).perform();

        WebElement editBtn = driver.findElement(By.xpath("//span[text()='Edit']"));
        editBtn.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(2000);

        //double click
        WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions act2=new Actions(driver);
        act2.contextClick(doubleClick).doubleClick().perform();

        Alert al = driver.switchTo().alert();
        al.accept();




    }
}
