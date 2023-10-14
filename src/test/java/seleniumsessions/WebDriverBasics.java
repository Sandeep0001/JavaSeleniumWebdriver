package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

    public static void main(String[] args) {
        //1. Firefox browser
        //Gekodriver -- used to launch firefox, geckodriver is a class in java.//download geckodriver

        //System.setProperty("webdriver.gecko.driver", "F:\\seleniumDrivers\\geckodriver.exe");//we have to use double back slash to define path.
        //WebDriver driver = new FirefoxDriver();//FirefoxDriver(); is implementing WebDriver.//will launch FF

        //driver.get("https://www.google.com");//enter url

        //2. chrome browser

        System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");//download chrome driver
        WebDriver driver = new ChromeDriver();//launch chrome

        driver.get("https://www.google.com");//enter url
        String title = driver.getTitle();//get title of website

        System.out.println(title);
        //validataion point
        if (title.equals("Google")) {
            System.out.println("Correct Title");
        } else {
            System.out.println("Incorrect title");
        }

        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());

        driver.quit();//to quit the browser
    }
}
