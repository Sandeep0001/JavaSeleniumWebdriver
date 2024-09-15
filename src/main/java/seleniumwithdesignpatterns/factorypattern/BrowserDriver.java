package seleniumwithdesignpatterns.factorypattern;

import org.openqa.selenium.WebDriver;

public interface BrowserDriver {
    WebDriver createDriver();
}
