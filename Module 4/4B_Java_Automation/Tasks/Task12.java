import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    // Navigate to https://jqueryui.com/
    // Click on the "resize" menu from the left pane
    // Drag the box to be bigger.(Resize the box to be bigger)

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Navigate to the Url
        driver.get("https://jqueryui.com/");
        Thread.sleep(5000);

        // Click on the "Resizable" menu from the left pane
        WebElement resizableLink = driver.findElement(By.linkText("Resizable"));
        resizableLink.click();
        Thread.sleep(5000);

        // Switch to the iframe containing the resizable box
        driver.switchTo().frame(0);

        // Locate the resizable box
        WebElement resizableBox = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        Thread.sleep(5000);

        // Resize the box by dragging it
        Actions action;
        action = new Actions(driver);
        action.clickAndHold(resizableBox).moveByOffset(150, 50).release().perform();
        Thread.sleep(5000);

        //Close the Browser
        driver.quit();

    }
}
