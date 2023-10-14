package seleniumsessions;

import com.google.qa.base.SeleniumBase;
import org.openqa.selenium.By;

public class FrameHandling extends SeleniumBase {

    public static void main(String[] args) throws InterruptedException {
        initialization();
        driver.get("https://www.freecrm.com/index.html");

        driver.findElement(By.name("username")).sendKeys("y3te924psx1y");
        driver.findElement(By.name("password")).sendKeys("1t6lxkTddupZ");
        driver.findElement(By.className("input-group-btn")).click();
        Thread.sleep(3000);

        driver.switchTo().frame("mainpanel");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
    }
}
