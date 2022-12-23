package com.Syntax.class10_Pagination_Calendar_AdvanceXP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AdvanceXpath {
    public static void main(String[] args) {
        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        //driver.manage().window().maximize();

        //div[@id='globalContainer']/following-sibling::span
        //div[@id='contentCurve']/preceding-sibling::ul

    }
}
