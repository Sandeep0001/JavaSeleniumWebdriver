package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    static WebDriver driver;

    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();//Firstly we create the object to read the properties class
        //we create one more object to read which file
        FileInputStream ip = new FileInputStream("C:\\Users\\user\\Desktop\\JavaTraining\\JavaSeleniumWebdriver\\src\\SeleniumSessions\\config.properties");

        prop.load(ip);

        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("age"));

        String url = prop.getProperty("URL");

        System.out.println(url);

        String browserName = prop.getProperty("browser");

        System.out.println(browserName);

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "F:\\seleniumDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "F:\\seleniumDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.get(url);

        driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys(prop.getProperty("email"));
        driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
    }
}
