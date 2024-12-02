import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    //Navigate to https://idorenyinankoh.github.io/loginPage/
    //Check if the " create account" button is enabled"
    //Fill all the fields
    //Check if the "create account"is enabled

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Navigate to the Url
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        Thread.sleep(5000);

        // Check if the "Create Account" button is enabled before filling the fields
        WebElement createAccountButton = driver.findElement(By.cssSelector("button[type='submit']"));
        System.out.println("Is 'Create Account' button enabled? " + createAccountButton.isEnabled());

        // Fill all fields
        driver.findElement(By.name("firstName")).sendKeys("Emmanuel");
        driver.findElement(By.name("lastName")).sendKeys("Otor");
        Thread.sleep(5000);

        driver.findElement(By.name("email")).sendKeys("otor4real2007@gmail.com");
        //driver.findElement(By.cssSelector("input[type='radio'][value='male']")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("input#male.radio")).click();
        driver.findElement(By.name("password")).sendKeys("Password001");
        Thread.sleep(5000);

        driver.findElement(By.name("confirmPass")).sendKeys("Password001");
        driver.findElement(By.name("xpLevel")).sendKeys("I am a Software Quality Assurance Engineer.");

        // Check if the "Create Account" button is enabled after filling the fields
        System.out.println("Is 'Create Account' button enabled after filling fields? " + createAccountButton.isEnabled());

        //Close the Browser
        driver.quit();
    }
}
