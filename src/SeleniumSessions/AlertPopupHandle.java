package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();//clicking on go btn
		
		Thread.sleep(5000);//to sleep for 5 sec
		 
		//we have to use Alert API to switch -- method name is switchTo().alert();
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		//validataion part
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("Correct Text");
		}
		else{
			System.out.println("Incorrect Text");
		}
		
		alert.accept();//click on ok 
		
		//alert.dismiss();//click on cancel
		
	}

}
