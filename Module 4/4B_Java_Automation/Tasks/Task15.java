
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task15 {
    // Structure your TestNG file to run Navigate to google and search for testify.
    // Close the browser
    // Navigate to https://www.mcdonalds.com/us/en-us.html .
    // print out the colour - code of the order now button.
    // All test should be done in one class and utilize your knowledge of tesNG annotation)



    @Test
    public void Window() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Navigate to the Url
        driver.get("https://www.google.com");

        // Search for testify
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify limited");
        Thread.sleep(5000);

        wait(ExpectedConditions.titleContains("testify"));
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]")).click();
        Thread.sleep(5000);


        // Navigate To Url
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        Thread.sleep(5000);

        // Get the color code of the button and Find the "Order Now" button
        String color = driver.findElement(By.cssSelector("#button-ordernow")).getCssValue("color");
        System.out.println(color);

        //Close the Browser
        driver.quit();
    }

    private void wait(ExpectedCondition<Boolean> testify) {
    }

}




















//       // @Test
//        public void navigateToGoogleAndSearch() throws InterruptedException {
//            // Navigate to the Url
//            Driver.get("https://www.google.com/");
//
//
//            Thread.sleep(5000);
//
//            // Search for "testify"
//            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
//            searchBox.sendKeys("testify");
//            searchBox.submit();
//
//            // Optional: Wait for search results to load
//            wait.until(ExpectedConditions.titleContains("testify"));
//
//            // Optional: Wait for search results to load
//            wait.until(ExpectedConditions.titleContains("testify"));
//        }
//
//    @Test(priority = 2)
//    public void navigateToMcDonaldsAndPrintOrderNowColor() {
//        // Navigate to McDonald's website
//        driver.get("https://www.mcdonalds.com/us/en-us.html");
//
//        // Find the "Order Now" button
//        WebElement orderNowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='button-ordernow']")));
//        // Get the color code of the button
//        String color = orderNowButton.getCssValue("background-color");
//        System.out.println("Color code of the 'Order Now' button: " + color);
//    }
//
//    @AfterClass
//    public void closeDriver() {
//        if (driver != null) {
//            driver.quit();
//
//    }
//}
