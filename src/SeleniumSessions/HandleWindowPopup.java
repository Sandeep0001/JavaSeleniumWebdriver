package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();//to maximize the window
		driver.manage().deleteAllCookies();//to delete all the cookies
		
		//global wait / dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[contains(text(), 'Good PopUp #3')]")).click();
		
		Set<String> handler = driver.getWindowHandles();//to get window id
		
		Iterator<String> it = handler.iterator();//in java the Set object will not store values in indexes so use iterator.
		
		String parentWindowId = it.next();//It will give the value of first / parent window
		System.out.println("parent window id:"+ parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child window id:"+ childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		System.out.println("child window popup title:"+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("parent window title:"+ driver.getTitle());
		
		

	}

}
