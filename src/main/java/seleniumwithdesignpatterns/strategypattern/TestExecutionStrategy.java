package seleniumwithdesignpatterns.strategypattern;

import org.openqa.selenium.WebDriver;

public interface TestExecutionStrategy {
    WebDriver setupDriver(String browserName);
}
