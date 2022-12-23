package com.Syntax.class05_CheckBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo2 {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']")); //find all check boxes

        //traverse through list od checkboxes to find the desire one
        for(WebElement checkBox:checkBoxes){
            String optionName=checkBox.getAttribute("value"); //get the attribute value to check if this is the right option to select
            //if condition to make sure it is the right checkbox
            if(optionName.equalsIgnoreCase("Option-2")){
                checkBox.click(); //  if passed click on it
            }
        }

    }
}
