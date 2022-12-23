import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

    }
}
