package com.Syntax.class07_Window_ImplicitWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {
    public static void main(String[] args) {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("http://accounts.google.com/signup");
        //driver.manage().window().maximize();

        //go to gmail sighup page and get window handle and print it

        String gmailHandle=driver.getWindowHandle();

        System.out.println("The handle of the current page is "+gmailHandle);






    }

}
