package seleniumtraining;

import base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest extends SeleniumBase {

    public static void main(String[] args) throws InterruptedException {
        initialization();
        //mandatory options:
        //1. chrome version should be greater than 59 on mac and greater than 60 on windows
        //2. window-size=1400,800
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,800");
        options.addArguments("headless");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.freecrm.com");
        System.out.println("login page title:" + driver.getTitle());

        driver.findElement(By.name("username")).sendKeys("y3te924psx1y");
        driver.findElement(By.name("password")).sendKeys("1t6lxkTddupZ");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        System.out.println("Logged in suceesfull and title is:" + driver.getTitle());
    }
}
