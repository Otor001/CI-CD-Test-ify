import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Task11 {
    // Go to google.
    // Search for "testify ltd"
    // Click on the search that result with www.testifyltd.com
    // Scroll down the testify website and click on the LinkedIn icon.
    // Get the description text on the user page.(image; https://i.imgur.com/PmrWDXa.png )

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Navigate to the Url
        driver.get("https://www.google.com");
        Thread.sleep(5000);

        // Search for "testify ltd"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Testify Ltd");
        searchBox.submit();
        Thread.sleep(5000);

        // Click on the Testify website link
        WebElement testifyLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/h3"));
        testifyLink.click();
        Thread.sleep(5000);

        // Scroll down to the LinkedIn icon
        Actions actions = new Actions(driver);
        WebElement linkedInIcon = driver.findElement(By.cssSelector("a[href*='linkedin.com']"));
        actions.moveToElement(linkedInIcon).perform();
        Thread.sleep(5000);

        // Click on the LinkedIn icon
        linkedInIcon.click();
        Thread.sleep(5000);

        // Get window handles and switch to the LinkedIn tab
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                Thread.sleep(5000);
            }

            driver.findElement(By.cssSelector("icon[class='contextual-sign-in-modal__modal-dismiss-icon lazy-loaded'] svg")).click();
            Thread.sleep(5000);

            // Get the description text
            WebElement descriptionElement = driver.findElement(By.xpath("//span[@class='line-clamp-2']"));
            String descriptionText = descriptionElement.getText();
            System.out.println("Description: " + descriptionText);
            Thread.sleep(5000);

            //Close the Browser
            driver.quit();
        }
    }
}



