package com.Syntax.Test;

import com.Syntax.Pages.LoginPageWithPageFactory;
import com.Syntax.utils.CommonMethods;

public class LoginPageTestWithPageFactory {
    public static void main(String[] args) {
        CommonMethods.openSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPageWithPageFactory login=new LoginPageWithPageFactory();

        login.userName.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginBtn.click();


    }
}
