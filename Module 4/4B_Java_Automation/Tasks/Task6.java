import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task6 {
    //Login using username and password.
    //Click on the login button,
    //click on the "add to cart" button of any product (Add only one item)
    //click the cart icon on the top right.
    //Click on checkout.  USE ONLY CSS LOCATION STRATEGY
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
        driver.findElement(By.cssSelector("input[name = 'user-name']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[name = 'password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);

        //Click on the login button,
        driver.findElement(By.cssSelector("input[name = 'login-button']")).click();
        Thread.sleep(5000);

        //click on the "add to cart" button of any product (Add only one item)
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(5000);

        //click the cart icon on the top right.
        driver.findElement(By.cssSelector("#shopping_cart_container")).click();
        Thread.sleep(5000);

        //Click on checkout.  USE ONLY CSS  LOCATION STRATEGY
        driver.findElement(By.cssSelector("#checkout")).click();
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        //Close the Browser
        driver.quit();
    }
}
