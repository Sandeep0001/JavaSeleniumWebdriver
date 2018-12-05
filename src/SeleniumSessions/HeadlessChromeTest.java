package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		
		//mandatory options:
		//1. chrome version should be greater than 59 on mac and greater than 60 on windows
		//2. window-size=1400,800
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();//to maximize the window
		driver.manage().deleteAllCookies();//to delete all the cookies
		
		//global wait / dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		System.out.println("login page title:"+ driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("y3te924psx1y");
		driver.findElement(By.name("password")).sendKeys("1t6lxkTddupZ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("Logged in suceesfull and title is:"+ driver.getTitle());
	}

}
