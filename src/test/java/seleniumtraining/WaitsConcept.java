package seleniumtraining;

import base.SeleniumBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsConcept extends SeleniumBase {
    public static void main(String[] args) {
        initialization();
        driver.get("http://www.facebook.com");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));//will wait till the page loads for given seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//will wait till the elements are loaded after page load from given seconds

        //ExplicitWait Syntax
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".classlocator")));

        //ExplicitWaitExample
        clickOn(driver, driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")), Duration.ofSeconds(60)); //create a page link

        //FluentWait Syntax
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

        //FluentWait example
        //Declare and initialise a fluent wait
        FluentWait<WebDriver> fluent = new FluentWait<>(driver);
        //Specify the timeout of the wait
        fluent.withTimeout(Duration.ofSeconds(50));
        //Specify polling time
        fluent.pollingEvery(Duration.ofSeconds(10));
        //Specify what exceptions to ignore
        fluent.ignoring(NoSuchElementException.class);

        //This is how we specify the condition to wait on.
        //This is what we will explore more in this chapter
        fluent.until(ExpectedConditions.alertIsPresent());
    }

    public static void clickOn(WebDriver driver, WebElement locator, Duration timeout) {
        new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
        locator.click();
    }
}
