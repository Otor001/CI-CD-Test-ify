import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
    // Navigate to https://jqueryui.com/
    // Click on the dialog menu from the left pane
    // Click on the close icon to close the dialogue box in the middle

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Navigate to the Url
        driver.get("https://jqueryui.com/");
        Thread.sleep(5000);

        // Click on the "Dialog" menu from the left pane
        WebElement dialogLink = driver.findElement(By.linkText("Dialog"));
        dialogLink.click();
        Thread.sleep(5000);

        // Click on the close icon to close the dialog box
        WebElement closeButton = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        closeButton.click();
        Thread.sleep(5000);

        //Close the Browser
        driver.quit();
    }
}
