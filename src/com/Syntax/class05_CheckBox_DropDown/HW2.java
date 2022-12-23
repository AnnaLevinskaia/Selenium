package com.Syntax.class05_CheckBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {

    public static void main(String[] args) throws InterruptedException {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        WebElement AllCateg=driver.findElement(By.xpath("//select[@id='gh-cat']")); //find all categories
        AllCateg.click();

        Select select=new Select(AllCateg); //yse select class
        List<WebElement> options=select.getOptions(); //get all option available
        for (WebElement category:options){
            String categoryText= category.getText();
            System.out.println(categoryText);
            if(categoryText.equalsIgnoreCase("Computers/Tablets & Networking")){
                select.selectByVisibleText(categoryText);
            }
        }








    }
}
