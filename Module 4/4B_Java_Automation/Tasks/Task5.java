import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task5 {
    //Navigate to https://www.saucedemo.com/
    // Login using username and password.
    // Click on the login button,
    // click on the "add to cart" button of any product (Add only one item)
    // click the cart icon on the top right.
    // Click on checkout.  USE ONLY XPATH LOCATION STRATEGY

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");

    // Launch browser
    WebDriver driver = new ChromeDriver();

    // Maximize the browser
        driver.manage().window().maximize();

    // Navigate to the Url
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);

    //Login using username and password.
        driver.findElement(By.xpath("//input[@name= 'user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@name= 'password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);

    //Click on the login button,
        driver.findElement(By.xpath("//input[@name= 'login-button']")).click();
        Thread.sleep(5000);

    //Click on the "add to cart" button of any product (Add only one item)
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(5000);

    //Click the cart icon on the top right.
        driver.findElement(By.xpath("//div[@id = 'shopping_cart_container']")).click();
        Thread.sleep(5000);

    //Click on checkout.  USE ONLY XPATH LOCATION STRATEGY
        driver.findElement(By.xpath("//button[@id = 'checkout']")).click();
        Thread.sleep(5000);
    //Close the Browser
        driver.quit();
    }
}




