package com.Syntax.recap02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) {
        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        //find the radio button
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        //traverse through the list of web elements
        for (WebElement radioBtn:radioBtns) { //extract web element
            //find the desire radio button
            String option=radioBtn.getAttribute("value");

            if(option.equalsIgnoreCase("5 - 15")){ //use loop for chose it is better practice, because in future it is easily to perform correction in code
                radioBtn.click();
            }
        }

    }
}
