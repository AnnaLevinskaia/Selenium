package com.Syntax.class08_Wait_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableBasic {
    public static void main(String[] args) {
        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //driver.manage().window().maximize();

        //        print the whole table on the console
        WebElement allTable=driver.findElement(By.xpath("//table[@id='customers']"));
        String textAllTable = allTable.getText();
       // System.out.println(textAllTable);

        //print all the rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row:rows
             ) {
            String rowText = row.getText();
            System.out.println(rowText);
            System.out.println("---------");
        }

        for (WebElement roww:rows
        ) {
            String rowText = roww.getText();
            if(rowText.contains("Google")){
                System.out.println(rowText);
            }
        }

        //print all individual colons from the table
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]  "));


        for (WebElement column:columns
             ) {
            String colT = column.getText();
            System.out.println(colT);
        }



    }
}
