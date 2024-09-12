package seleniumtraining;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import singleton.WebDriverManager;

public class AppTest {
    private WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void setUp(String browser){
        driver = WebDriverManager.getInstance(browser).getDriver();
    }

    @Test
    public void testGoogle(){
        driver.get("https://www.google.com");
        System.out.println(Thread.currentThread().getName() + ": " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @AfterClass
    public void teardown(){
        WebDriverManager.quitBrowser();
    }
}
