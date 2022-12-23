package com.Syntax.Pages;

import com.Syntax.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethods {

    //public WebElement contBtn =  driver.findElement(By.xpath("//a[text()='Continue anyway']"));
    public WebElement userNameField = driver.findElement(By.id("txtUsername"));
    public WebElement passwordField = driver.findElement(By.id("txtPassword"));
    public WebElement loginButton = driver.findElement(By.id("btnLogin"));
    public WebElement loginSign = driver.findElement(By.xpath("//div[text()='LOGIN Panel']"));

}
