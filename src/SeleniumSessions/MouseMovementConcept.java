package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();//to maximize the window
		driver.manage().deleteAllCookies();//to delete all the cookies
		
		//Mouse hover and click its sub element concept
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);//to perform mouse movements we have to create Actions class object reference.
		
		//.build().perform(); -- is a method which will perform the action
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		Thread.sleep(3000);	//static wait
		driver.findElement(By.linkText("Priority Check-in")).click();
	}

}
