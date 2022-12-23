package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");   //name of the driver, path in 2

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        String url=driver.getCurrentUrl();
        System.out.println(url);  //print URL

        String title=driver.getTitle();
        System.out.println(title);  //print title

        driver.quit(); //close chrome

        driver.close();





    }
}
