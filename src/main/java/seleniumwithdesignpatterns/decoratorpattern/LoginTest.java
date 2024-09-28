package seleniumwithdesignpatterns.decoratorpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }

    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage(driver);
        String homeTitle = loginPage.login("may2024@open.com", "Selenium@12345");
        Assert.assertEquals(homeTitle, "My Account");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
