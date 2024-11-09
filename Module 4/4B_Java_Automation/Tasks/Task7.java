import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task7 {
    //Navigate to https://worldweather.wmo.int/en/home.html.
    //Search for your city in the search field. When the result loads,
    //print the days and weather description for each of the days shown in a readable and understandable manner.

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Navigate to the Url
        driver.get("https://worldweather.wmo.int/en/home.html");
        Thread.sleep(5000);

        // Search for the city in the search field
        driver.findElement(By.cssSelector("#q_search")).sendKeys("Nigeria");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#q_search")).submit(); // Submit the search
        Thread.sleep(5000); // Wait for the results to load

        // Locate the weather results
        List<WebElement> results = driver.findElements(By.cssSelector(".fav_city_fc_block_mask .row"));

        // Print the day and weather description
        for (WebElement result : results) {
            String day = result.findElement(By.cssSelector(".date")).getText();
            String weatherDescription = result.findElement(By.cssSelector(".weather")).getText();
            System.out.println("Date: " + day + " - Weather: " + weatherDescription);

            //Close the Browser
            driver.quit();
        }
    }
}
