package magento;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Logger;

public class test_magento {
    private static final Logger logger = Logger.getLogger(test_magento.class.getName());
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        try {
            // Get to main page
            driver.get("https://magento.softwaretestingboard.com/");

            // Going on sign up page
            driver.findElement(By.className("authorization-link")).click();
            driver.findElement(By.linkText("Create an Account")).click();


            // Fill the sign up details
            driver.findElement(By.id("firstname")).sendKeys("Param");
            driver.findElement(By.id("lastname")).sendKeys("Singh");
            driver.findElement(By.id("email_address")).sendKeys("paramtestfinal@gmail.com");
            driver.findElement(By.id("password")).sendKeys("Param@test00");
            driver.findElement(By.id("password-confirmation")).sendKeys("Param@test00");
            driver.findElement(By.cssSelector("button[title='Create an Account']")).click();

            // logOut
            driver.findElement(By.className("customer-welcome")).click();
            driver.findElement(By.className("authorization-link")).click();

            // Sign up
            driver.findElement(By.className("authorization-link")).click();
            driver.findElement(By.id("email")).sendKeys("paramtestfinal@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("Param@test00");
            driver.findElement(By.id("send2")).click();

            //Change password
            driver.get("https://magento.softwaretestingboard.com/customer/account/");
            WebElement changePassLink = driver.findElement(By.linkText("Change Password"));
            changePassLink.click();
            driver.findElement(By.id("current-password")).sendKeys("Param@test00");
            driver.findElement(By.id("password")).sendKeys("Param22@test");
            driver.findElement(By.id("password-confirmation")).sendKeys("Param22@test");
            driver.findElement(By.cssSelector("button[title='Save']")).click();

            // Login after change the password
            driver.findElement(By.id("email")).sendKeys("paramtestfinal@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("Param22@test");
            driver.findElement(By.id("send2")).click();

        } catch (Exception e) {
            logger.severe("An error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
