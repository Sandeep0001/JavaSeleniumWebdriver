package seleniumtraining.designpatterntests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import seleniumwithdesignpatterns.factorypattern.DriverFactory;

public class LoginPageTestFactory {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = DriverFactory.getDriver("chrome").createDriver();
        driver.get("https://www.facebook.com/login/");
    }

    @Test
    public void logintTitleTest(){
        Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
    }

    @Test
    public void loginTest(){
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//div[@class='_55r1 _1kbt']")).sendKeys("test123");
        driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
