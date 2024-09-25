package seleniumwithdesignpatterns.strategypattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeadlessExecutionStrategy implements TestExecutionStrategy{
    @Override
    public WebDriver setupDriver(String browserName) {
        switch (browserName.toLowerCase().trim()) {
            case "chrome" -> {
                ChromeOptions co = new ChromeOptions();
                co.addArguments("--headless");
                return new ChromeDriver(co);
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
