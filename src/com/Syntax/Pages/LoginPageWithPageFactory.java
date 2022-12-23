package com.Syntax.Pages;

import com.Syntax.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement userName;

    @FindBy(id="txtPassword")
    public WebElement passwordField;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    //    call the constructor to intialize all elements
    public LoginPageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }



}
