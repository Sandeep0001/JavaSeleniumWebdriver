package seleniumtraining.testngbasics;

import base.SeleniumBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest extends SeleniumBase {

    @BeforeMethod
    public void setUp() {
        initialization();
        driver.get("https://www.google.com/");
    }

    @Test
    public void googleTitleTest() {
        String title = driver.getTitle();
        System.out.println(title);

        Assert.assertEquals(title, "Google", "title is not matched");
    }

    @Test
    public void googleLogoTest() {
        boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();

        Assert.assertTrue(b);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
