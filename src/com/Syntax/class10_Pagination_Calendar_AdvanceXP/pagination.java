package com.Syntax.class10_Pagination_Calendar_AdvanceXP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class pagination {
    public static void main(String[] args) {
        //  set the path to the driver to link it with our class: on mac u dont need .exe; on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //create a webdriver instance

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //driver.manage().window().maximize();

        driver.findElement(By.linkText("Continue anyway")).click();
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.name("Submit"));
        loginBtn.click();

        WebElement pimBtn = driver.findElement(By.linkText("PIM"));
        pimBtn.click();

//        //get all ids from the column
//        List<WebElement> columnID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        boolean idFound=false;
        while (!idFound){ //while loop executes till the value in parameters hold a status true

            //get all ids from the column
            List<WebElement> columnID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            //because new page is refresh and we need to find element again

            for (int i = 0; i < columnID.size(); i++) { //i-it is a row number\\
            String id = columnID.get(i).getText(); //extract the id from the entry in list
            if (id.equalsIgnoreCase("4626955")) { //check if it is desire id
                //check the checkbox associated with this particular row
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]")); //i-row number
                checkBox.click();
                idFound=true;
                break;
            }
        }
        if(!idFound){
            //clicking on the next page
            WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
            nextBtn.click();
        }
        }
    }
}
