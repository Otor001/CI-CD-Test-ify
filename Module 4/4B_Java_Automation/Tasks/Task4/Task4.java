import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    // Navigate to http://demo.guru99.com/
    // Click on the security Project menu.
    // Input any text in the email and password field.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");
        // Launch browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        // navigate to the Url
        driver.get("http://demo.guru99.com/");
        Thread.sleep(5000);
        driver.findElement(By.linkText("Security Project")).click();
        //driver.findElement(By.linkText("http://demo.guru99.com/Security/SEC_V1/index.php")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("uid")).sendKeys("Testify");
        Thread.sleep(5000);
        driver.findElement(By.name("Password")).sendKeys("Password001");
        Thread.sleep(5000);

        //Close the Browser
        driver.quit();

    }
}
