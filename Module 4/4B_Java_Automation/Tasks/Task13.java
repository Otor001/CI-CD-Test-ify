import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    // Go to https://selenium08.blogspot.com/
    // search for "Demo dropdown" form the search field.
    // on the drop down page,
    // select Nigeria from the country list and
    // select january february and march from the moths list. (image; https://i.imgur.com/sIgQwwG.png)

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Navigate to the Url
        driver.get("https://selenium08.blogspot.com/");
        Thread.sleep(5000);

        // Search for "Demo dropdown"
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[1]/div[2]/button"));
        WebElement searchBox1 = searchBox;
        searchBox.click();
        Thread.sleep(5000);
        WebElement searchBox2 = driver.findElement(By.xpath("//input[@aria-label='Search this blog']"));
        searchBox2.sendKeys("Demo dropdown");
        searchBox2.submit();
        Thread.sleep(5000);

        // Click on the dropdown link
        WebElement dropdownLink = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/article/div/div[2]/div[1]/h3/a"));
        dropdownLink.click();

        // Select "Nigeria" from the country dropdown
        WebElement countryDropdown = driver.findElement(By.xpath("//*[@id=\"post-body-4074800055706479627\"]/div/select"));
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByVisibleText("Nigeria");
        Thread.sleep(5000);

        // Select "January," "February," and "March" from the months dropdown
        WebElement monthsDropdown = driver.findElement(By.xpath("//*[@id=\"post-body-4074800055706479627\"]/div/div[3]/select")); // Replace with actual ID
        Select monthsSelect = new Select(monthsDropdown);
        monthsSelect.selectByVisibleText("January");
        monthsSelect.selectByVisibleText("February");
        monthsSelect.selectByVisibleText("March");
        Thread.sleep(5000);

        //Close the Browser
        driver.quit();
    }
}
