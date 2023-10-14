package seleniumtraining;

import base.SeleniumBase;
import org.openqa.selenium.WindowType;

public class Navigations extends SeleniumBase {

    public static void main(String[] args) throws InterruptedException {
        initialization();
        driver.get("https://www.google.com");

        driver.navigate().to("https://www.facebook.com");//used to navigate to external URL

        //back and forward simulation
        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        //to refresh the page
        driver.navigate().refresh();

        // Opens a new window and switches to new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.browserstack.com/");  // Opens BrowserStack homepage in the newly opened window

        // Opens a new tab in existing window
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.browserstack.com/"); // Opens Browserstack homepage in the newly opened tab
    }
}
