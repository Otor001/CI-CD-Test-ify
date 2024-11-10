import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task14 {
    // Navigate to https://www.toolsqa.com/
    // Close the dialogue box that pops up after a few seconds
    // Click on the tutorial button in the top left corner of the page

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Navigate to the Url
        driver.get("https://www.toolsqa.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(5000);

        // Close the dialogue box after it appears
        WebElement closeDialog = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Accept')]")));
        closeDialog.click();
        Thread.sleep(5000);

        // Click on the Tutorials button
        WebElement tutorialsButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Tutorials")));
        tutorialsButton.click();
        Thread.sleep(5000);

        //Close the Browser
        driver.quit();
    }
}
