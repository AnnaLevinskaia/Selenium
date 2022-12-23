package com.Syntax.recap02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static <create> void main(String[] args) throws InterruptedException {
        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement createAcc=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAcc.click();

        Thread.sleep(2000);
        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        Select sel=new Select(day); //we can select any value

        sel.selectByIndex(4);
        Thread.sleep(2000);
        sel.selectByVisibleText("31");
        Thread.sleep(2000);
        sel.selectByValue("16");

        //find web element for month
        WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
        Select selMonth=new Select(month); //we can select any value

        selMonth.selectByVisibleText("Aug");

        //print all available months
        List<WebElement> option = selMonth.getOptions(); //get all option
        for (int i = 0; i < option.size(); i++) {
            String monts=option.get(i).getText();
            System.out.println(monts);


        }


    }
}
