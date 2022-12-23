package com.Syntax.class11_AbstrCl_Key_DragDrop_ScrSh;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester", Keys.TAB);

        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test",Keys.ENTER);

        TakesScreenshot ss= (TakesScreenshot)driver;
        File sourceFile=ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile,new File("C:\\Users\\Anna\\IdeaProjects\\Selenium\\screenshots\\SmartBear\\adminLogin.png"));
        FileUtils.copyFile(sourceFile,new File("C:\\Users\\Anna\\IdeaProjects\\Selenium\\screenshots\\SmartBear\\abc.png"));




    }
}
