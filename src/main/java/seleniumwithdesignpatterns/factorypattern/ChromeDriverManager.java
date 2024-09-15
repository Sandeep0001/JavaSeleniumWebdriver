package seleniumwithdesignpatterns.factorypattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager implements BrowserDriver{
    @Override
    public WebDriver createDriver() {
        return new ChromeDriver();
    }
}
