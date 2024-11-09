import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    //Navigate to saucedemo.com
    //Login with username and password
    //Navigate back to log in screen from the homepage
    //Print out the Login button attribute "VALUE" to verify that you are back on the login screen
    //Navigate forward to the homepage,
    //Print out a name of a product to verify that you are back on the homepage

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Navigate to the Url
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);

        // Login with username and password
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);

        // Navigate back to the login screen
        driver.navigate().back();
        Thread.sleep(5000);

        // Print out the Login button attribute "VALUE" to verify that you are back on the login screen
        WebElement loginButton = driver.findElement(By.id("login-button"));
        String loginButtonValue = loginButton.getAttribute("value");
        System.out.println("Login Button Value: " + loginButtonValue);
        Thread.sleep(5000);

        // Navigate forward to the homepage
        driver.navigate().forward();
        Thread.sleep(5000);

        // Print out the name of a product to verify that you are back on the homepage
        WebElement productName = driver.findElement(By.cssSelector(".inventory_item_name"));
        System.out.println("Product Name: " + productName.getText());

        //Close the Browser
        driver.quit();
    }
}
