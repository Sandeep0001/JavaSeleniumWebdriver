package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dnt.abine.com/#/register");
		
		//There are 8 locators in selenium
		//1. xpath --2
		//absolute xpath should not be used -- html/body/div[1]/div[5]/div[7]/a
		//only relative xpath should be used -- //*[@id='email']
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@def.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("1234");
//		driver.findElement(By.xpath("//*[@id='password-confirmation']")).sendKeys("123");
		
		//2. id -- 1st priority
//		driver.findElement(By.id("email")).sendKeys("abc@def.com");
//		driver.findElement(By.id("password")).sendKeys("1234");
		
		//3. name -- 3
//		driver.findElement(By.name("user[email]")).sendKeys("abc@def.com");
//		driver.findElement(By.name("user[password]")).sendKeys("1234");
		
		//4. linkText -- this is only for links --1
//		driver.findElement(By.linkText("Terms of Service")).click();
		
		//5. partiallinkTest : not recommended : not useful too
//		driver.findElement(By.partialLinkText("Privacy")).click();
		
		//6.CSSSelector -- 2
		//if id is there -- #[id]
		//if class is there -- .[class]
//		driver.findElement(By.cssSelector("#email")).sendKeys("abc@def.com");
		
		//7. class name: not recommended : no useful too because class name can be duplicate. -- 4
//		driver.findElement(By.className("form-control")).sendKeys("abc@def.com");
		
		//8. TagName
	}

}
