package com.Syntax.class05_CheckBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2Teacher {
    public static void main(String[] args) throws InterruptedException {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        //select from drop down
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Select sel=new Select(dropDown);
        sel.selectByValue("58058");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

       // verify the title

        String title=driver.getTitle();  //-- to get title
        //or WebElement title=driver.findElement(By.xpath("//title"));
        //verification
        System.out.println(title);
        if(title.equalsIgnoreCase("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("The title is verified");
        } else{
            System.out.println("The title is incorrect");
        }
    }
}
