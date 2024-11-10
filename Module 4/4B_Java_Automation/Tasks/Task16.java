
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task16 {
    //Navigate to https://testifyltd.com/ .
    //Assert that Our contact column at the footer of the homepage has the following
    // correct details, EMAIL: info@testifyltd.co.uk
    //LOCATION: Nigeria
    //PHONE: (+234)904-882-0971

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Downloads\\SeleniumWebDriver\\src\\chromedriver-win64\\chromedriver.exe");

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Navigate to the Url
        driver.get("https://testifyltd.com/");
        Thread.sleep(5000);

        String info = driver.findElement(By.xpath("//p[contains(text(),' (+234)905-882-0971')]")).getText();
        System.out.println(info);
        Thread.sleep(5000);

//        Assert.assertEquals(info,"info@testifyltd.com . (+234)905-882-0971" );
//        String email = driver.findElement(By.xpath("///p[contains(text(),'From Nigeria to the world')]')]")).getText();
//        System.out.println(email);
//        Assert.assertEquals(email,"info@testifyltd.co.uk" );
//        Thread.sleep(5000);
        String location = driver.findElement(By.xpath("//p[contains(text(),'From Nigeria to the world')]")).getText();
        System.out.println(location);
        Assert.assertEquals(location,"Nigeria" );
        Thread.sleep(5000);


        //Close the Browser
        driver.quit();
    }
}
