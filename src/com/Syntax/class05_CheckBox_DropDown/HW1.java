package com.Syntax.class05_CheckBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anna");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Levinskaia");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Aaa@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Aaa@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("aaa123");

        WebElement DDbirhdayMonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select selectMonth=new Select(DDbirhdayMonth);
        selectMonth.selectByIndex(8);

        WebElement DDbirhdayDay=driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select selectDay=new Select(DDbirhdayDay);
        selectDay.selectByValue("10");

        WebElement DDbirhdayYear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select selectYear=new Select(DDbirhdayYear);
        selectYear.selectByVisibleText("1990");

        driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();




    }
}
