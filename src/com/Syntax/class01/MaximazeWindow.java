package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximazeWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        //driver.manage().window().maximize();

        driver.manage().window().fullscreen(); //without url, tabs-differ with maximize
        driver.quit();


    }
}
