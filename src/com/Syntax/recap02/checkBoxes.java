package com.Syntax.recap02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();

        //find checkbox
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@name='color']"));
        //What does this list contain? -it comtains all the 6 web elements
        for(WebElement checkBx:checkBoxes){
           String color = checkBx.getAttribute("value");
           if(color.equalsIgnoreCase("blue")){
               checkBx.click();
               break;
           } else if (color.equalsIgnoreCase("yellow")) {
               checkBx.click();
               break;

           }
        }



    }
}
