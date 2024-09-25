package seleniumwithdesignpatterns.strategypattern;

import org.openqa.selenium.WebDriver;

public class TestDriver {

    public static void main(String[] args) {

        DriverContext driverContext = new DriverContext(new LocalExecutionStrategy());

        WebDriver driver = driverContext.getDriver("chrome");

        driver.get("https://www.google.com");

        driverContext.setTestExecutionStrategy(new HeadlessExecutionStrategy());
        driver.get("https://www.youtube.com");
        System.out.println(driver.getTitle()); //Youtube

    }

}
