package Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KongaWebsite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");
        // Launch KongaWebsite
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        // navigate to the Url
        driver.get("https://www.konga.com");
    }
}
