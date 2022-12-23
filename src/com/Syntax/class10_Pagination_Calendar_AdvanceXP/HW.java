package com.Syntax.class10_Pagination_Calendar_AdvanceXP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
/*    Go to syntax hrms .
    Go-to the recruitment tab.
    From the calendar  just select a date 8 August 2023*/
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

        WebElement recruitBtn = driver.findElement(By.linkText("Recruitment"));
        recruitBtn.click();

        WebElement calendarBtn = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
        calendarBtn.click();

        //find the web element by select tag
        WebElement month= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select selectMonth=new Select(month); //use select class
        selectMonth.selectByVisibleText("Aug");

        WebElement year= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectYear=new Select(year); //use select class
        selectYear.selectByVisibleText("2023");

        boolean isFound=false;
        while(!isFound){

                List<WebElement> dates = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr/td"));
                for (WebElement date:dates){
                    String currentDate=date.getText();
                    if(currentDate.equalsIgnoreCase("8")){
                        date.click();
                        break;
                    }
                }
                isFound=true;

        }
    }
}
