package com.Syntax.recap05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tables {
    public static void main(String[] args) {
//        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.linkText("Continue anyway")).click();
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();

        //go to the table and look for the id 45156A

        //get all the data in the column ID of the table
       // List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        //traverse to loop to get the id
        int rowCount = 0;
        boolean notFound=true;
        int idNumber=1;
        while (notFound) {
            //get all the data in the column ID of the table
            List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            for (WebElement id : idColumn) {
                String personID = id.getText();
                if (personID.equals("41641A") || personID.equals("8989A")) {
                    //System.out.println("I found the id"); just to check that everything ok

                    System.out.println("The row number of the desired id is " + (rowCount + 1));
                    WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + rowCount + 1 + "]/td[1]"));
                    checkbox.click();
                    if(idNumber==2) {
                        notFound = false;
                    }
                    idNumber=idNumber+1;
                    break;
                }
                rowCount = rowCount + 1;
            }
            if(notFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
                rowCount=0;
            }
        }
    }
}
