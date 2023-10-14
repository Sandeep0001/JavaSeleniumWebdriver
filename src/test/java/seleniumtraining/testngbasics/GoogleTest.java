package seleniumtraining.testngbasics;

import base.SeleniumBase;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest extends SeleniumBase {

    @BeforeMethod
    public void setUp() {
        initialization();
        driver.get("https://www.google.com/");
    }

    @Test(priority = 1, groups = "Title")
    public void googleTitleTest() {
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test(priority = 2, groups = "Logo")
    public void googleLogoTest() {
        boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
        System.out.println(b);
    }

    @Test(priority = 3, groups = "test")
    public void test1() {
        System.out.println("test1");
    }

    @Test(priority = 4, groups = "test")
    public void test2() {
        System.out.println("test2");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
