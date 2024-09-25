package seleniumwithdesignpatterns.strategypattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalExecutionStrategy implements TestExecutionStrategy{
    @Override
    public WebDriver setupDriver(String browserName) {

        switch (browserName.toLowerCase().trim()) {
            case "chrome" -> {
                return new ChromeDriver();
            }
            case "firefox" -> {
                return new FirefoxDriver();
            }
            case "edge" -> {
                return new EdgeDriver();
            }
            default -> {
                System.out.println("Please pass the right browser");
                throw new IllegalStateException("WRONG BROWSER NAME");
            }
        }
    }
}
