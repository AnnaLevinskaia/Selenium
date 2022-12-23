package com.Syntax.class05_CheckBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {

        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        //find the web element that contains the select class
        WebElement DD=driver.findElement(By.xpath("//select[@id='multi-select']"));

        //using select class
        Select sel=new Select(DD);

        sel.selectByIndex(3);
        sel.selectByVisibleText("Texas");
        Thread.sleep(2000);
        //deselect by index
        sel.deselectByIndex(3);

        //select all option
        List<WebElement> options=sel.getOptions(); //get all options

        for (int i = 0; i < options.size(); i++) {
            sel.selectByIndex(i);
        }

        Thread.sleep(2000);
        sel.deselectAll();

        //how we can check is drop down is multiselect
        boolean multiSelect=sel.isMultiple();
        System.out.println("Drop down is multi selectible "+multiSelect);


    }
}
