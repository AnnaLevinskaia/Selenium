package com.Syntax.class04CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement btn=driver.findElement(By.cssSelector("button#buttoncheck")); //find the element
        String text=btn.getText(); //get the text from the btn web element
        System.out.println("The text in the button "+text);


        //get the value from the attribute id from this web element

        String idValue=btn.getAttribute("id");
        System.out.println("The value of the attribute id is "+idValue);


    }
}
