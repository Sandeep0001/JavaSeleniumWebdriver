package SeleniumSessions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();//to maximize the window
		driver.manage().deleteAllCookies();//to delete all the cookies
		
		//global wait / dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		
		//1. how to get total count of links on the page
		//2. how to get the text of each link on the page
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));//tagName is a locator
		
		//size of linkList
		System.out.println(linkList.size());
		
		for(int i=0;i<linkList.size();i++){
			System.out.println(linkList.get(i).getText());
		}
	}

}
