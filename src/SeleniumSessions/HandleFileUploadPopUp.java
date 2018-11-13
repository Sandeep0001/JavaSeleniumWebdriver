package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "F:\\seleniumDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://html.com/input-type-file/");
		Thread.sleep(10000);
		driver.findElement(By.linkText("×")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\user\\Downloads\\extr.html");
	}

}
