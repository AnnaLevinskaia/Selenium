package com.Syntax.class09_Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) {
        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //driver.manage().window().maximize();

        driver.findElement(By.linkText("Continue anyway")).click();
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.name("Submit"));
        loginBtn.click();

        WebElement pimBtn = driver.findElement(By.linkText("PIM"));
        pimBtn.click();

        List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for (int i = 0; i < idColumn.size(); i++) { //or iterator, or for each loop
            //if we start from 1, it will be skip 0 and will not work properly
            String text=idColumn.get(i).getText();
            //System.out.println(text); to check the logic
            if(text.contains("968")){ //better use equal if we need excactly the same result
                //System.out.println(i); to debug the errors, we know the element index "968" on the table
                //WebElement checkBox = driver.findElement(By.id("ohrmList_chkSelectRecord_44968")); doesnt dinamic
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]"));
                checkBox.click();
            }
        }

    }
}
