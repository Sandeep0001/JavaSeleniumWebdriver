package seleniumwithdesignpatterns.factorypattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager implements BrowserDriver{
    @Override
    public WebDriver createDriver() {
        return new EdgeDriver();
    }
}
