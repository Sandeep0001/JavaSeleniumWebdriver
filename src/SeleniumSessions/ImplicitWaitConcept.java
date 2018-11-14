package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Implicit wait is a dynamic wait
public class ImplicitWaitConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();//to maximize the window
		driver.manage().deleteAllCookies();//to delete all the cookies
		
		driver.get("https://www.ulta.com/");
		//global wait / dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//will wait till the page loads for given seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//will wait till the elements are loaded after page load from given seconds
		
	}

}
