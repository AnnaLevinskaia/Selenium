package com.Syntax.class05_CheckBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        //find the web element by select tag
        WebElement dropDown= driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select=new Select(dropDown); //use select class

        //select an option by index, we need chose Tuesday
        select.selectByIndex(5);
        Thread.sleep(3000);
        //ot select be visible text
        select.selectByVisibleText("Saturday");
        Thread.sleep(3000);
        //select by value
        select.selectByValue("Wednesday");

        //get all options available in the drop-down
        List<WebElement> options=select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            WebElement option=options.get(i); //extract each option
            String text=option.getText();
            if(text.equalsIgnoreCase("Friday")){
                select.selectByIndex(i);
            }

        }






    }
}
