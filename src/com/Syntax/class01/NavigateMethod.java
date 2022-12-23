package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        driver.navigate().to("https://www.facebook.com/");

        //introduce some sleep - wait/pause for 2 sec
        Thread.sleep(2000);
        driver.navigate().back(); //go back to google
        Thread.sleep(2000);
        driver.navigate().forward(); //go back to fb

        Thread.sleep(2000);
        driver.navigate().refresh();  //refresh page

        driver.quit();

    }
}
