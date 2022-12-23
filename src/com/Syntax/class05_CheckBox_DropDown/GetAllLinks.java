package com.Syntax.class05_CheckBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        //get all links with anchor (a) tag
        List<WebElement> ebayLinks=driver.findElements(By.tagName("a"));
        System.out.println("The size of the list "+ebayLinks.size()); //print the size

        //implementing for loop to traverse through the list WebElements
        for (WebElement ebayLink:ebayLinks) {
            String link=ebayLink.getAttribute("href"); //extracting a value of attribute href
            System.out.println(link);
        }



    }
}
