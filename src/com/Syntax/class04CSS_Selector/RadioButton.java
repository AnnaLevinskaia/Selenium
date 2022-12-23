package com.Syntax.class04CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement maleRadioBtn=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']")); //get the radio button

        boolean displayStatus=maleRadioBtn.isDisplayed(); //check if radio btn displayed
        System.out.println("The radio button is Displayed "+displayStatus);

        boolean enableStatus=maleRadioBtn.isEnabled();
        System.out.println("The radio button is Enabled "+enableStatus);

        boolean selectStatus=maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected "+selectStatus);

        if(!selectStatus){ //check if radio btn is not selected than click
            //perform a click operation
            maleRadioBtn.click();
        }

        selectStatus=maleRadioBtn.isSelected();
        System.out.println("The radio button is selected "+selectStatus);



    }
}
