package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();//to maximize the winndow
		driver.manage().deleteAllCookies();//to delete all the cookies
		
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
