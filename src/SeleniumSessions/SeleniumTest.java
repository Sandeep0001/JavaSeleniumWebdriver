package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();//to maximize the window
		driver.manage().deleteAllCookies();//to delete all the cookies
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//will wait till the page loads for given seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//will wait till the elements are loaded after page load from given seconds
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign up")).click();
	}

}
