package com.Syntax.class09_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTable {
    public static void main(String[] args) {
        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        //driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        WebElement password= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");

        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginBtn.click();

        List<WebElement> secondColumns = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
        for (int i = 0; i < secondColumns.size(); i++) {
            //System.out.println(secondColumns.get(i).getText());
            String columnText = secondColumns.get(i).getText();
            if(columnText.equalsIgnoreCase("MyMoney")){
                //print out the number of the column which contains the Screen saver
                System.out.println(i+1); //I+1 because loops starting with 0, rows from1

                //get the checkbox
                WebElement checkBox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i+1+1) + "]/td[1]"));
                checkBox.click();
            }
        }





        
        

    }
}
