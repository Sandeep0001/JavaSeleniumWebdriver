package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();//to maximize the window
		driver.manage().deleteAllCookies();//to delete all the cookies
		
		//global wait / dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://makemysushi.com/4047");
//		driver.findElement(By.name("username")).sendKeys("y3te924psx1y");
//		driver.findElement(By.name("password")).sendKeys("1t6lxkTddupZ");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		Thread.sleep(3000);
//
//		driver.switchTo().frame("mainpanel");
//		Thread.sleep(2000);
		
		//links -- //a
		//images -- //img
		
		//1. get the list of all the links and  images
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of active links and images:---->"+linkList.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2. Iterate linklist : exclude all the links / images which doesn't have href attributes
		
		for(int i=0;i<linkList.size();i++){
			System.out.println(linkList.get(i).getAttribute("href"));
			if(linkList.get(i).getAttribute("href") != null && (! linkList.get(i).getAttribute("href").contains("javascript"))){
				activeLinks.add(linkList.get(i)); 
			}
		}
		
		//get the size of the active links list:
		System.out.println("Size of active links and images:---->"+activeLinks.size());
		
		//3. check the href url, with httpconnection api:
		//200 -- ok
		//404 -- not found
		//500 -- internal error
		//400 -- bad request
		for(int j=0;j<activeLinks.size();j++){
			HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"---->"+response);
		}
	}

}
