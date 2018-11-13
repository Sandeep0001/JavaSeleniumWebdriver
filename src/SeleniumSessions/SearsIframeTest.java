package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearsIframeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();//to maximize the winndow
		driver.manage().deleteAllCookies();//to delete all the cookies
		
		driver.get("https://www.sears.com/en_intnl/dap/shopping-tourism.html");

		driver.findElement(By.id("yourAccount")).click();
		Thread.sleep(6000);
//		driver.switchTo().frame(0);
//		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("abc@def.com");
	}

}
