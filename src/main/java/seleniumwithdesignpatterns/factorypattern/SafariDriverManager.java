package seleniumwithdesignpatterns.factorypattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverManager implements BrowserDriver{
    @Override
    public WebDriver createDriver() {
        return new SafariDriver();
    }
}