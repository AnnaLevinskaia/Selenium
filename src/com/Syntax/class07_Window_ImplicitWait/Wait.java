package com.Syntax.class07_Window_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {

    public static void main(String[] args) {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        //driver.manage().window().maximize();

        WebElement startBtn = driver.findElement(By.xpath("//button[text()='Start']"));

        startBtn.click();

        WebElement welcomeText = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));

        String text=welcomeText.getText();
        System.out.println("The text is "+text); //element was found, but not displayed yet, in DOM = display - none -->padding: 10%; display: none;
        //because of taht we have empty output

    }
}
