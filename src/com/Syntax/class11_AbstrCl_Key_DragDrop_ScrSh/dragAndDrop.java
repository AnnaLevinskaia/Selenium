package com.Syntax.class11_AbstrCl_Key_DragDrop_ScrSh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) {
        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");
        //driver.manage().window().maximize();

        //switch focus to iframe
        driver.switchTo().frame(0);

        WebElement draggableElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement droppableLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action = new Actions(driver);
        //action.dragAndDrop(draggableElement, droppableLocation).perform();
        //or the same
        action.clickAndHold(draggableElement).moveToElement(droppableLocation).release().build().perform(); //build use when we use multiple method to combine together




    }
}
