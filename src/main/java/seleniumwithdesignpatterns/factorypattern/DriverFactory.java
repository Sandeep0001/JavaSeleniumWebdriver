package seleniumwithdesignpatterns.factorypattern;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public static BrowserDriver getDriver(String browserType) {
        switch (browserType.toLowerCase()){
            case "chrome":
                return new ChromeDriverManager();
            case "firefox":
                return new FirefoxDriverManager();
            case "edge":
                return new EdgeDriverManager();
            case "safari":
                return new SafariDriverManager();
            default:
                throw new IllegalArgumentException("Invalid browser passed: " + browserType);
        }
    }

}
