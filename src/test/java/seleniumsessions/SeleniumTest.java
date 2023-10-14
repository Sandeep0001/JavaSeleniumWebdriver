package seleniumsessions;

import com.google.qa.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest extends SeleniumBase {

    public static void main(String[] args) throws InterruptedException {
        initialization();
        driver.get("https://www.spicejet.com/");

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Sign up")).click();
    }
}
