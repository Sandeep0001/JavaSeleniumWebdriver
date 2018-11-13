package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.roboform.com/filling-test-all-fields");
		
		//handle drop box
		//firstly we need to create select object and import the library
		Select select = new Select(driver.findElement(By.name("40cc__type")));
		select.selectByVisibleText("Master Card");
	}

}
