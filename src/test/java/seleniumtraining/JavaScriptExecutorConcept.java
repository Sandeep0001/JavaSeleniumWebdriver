package seleniumtraining;

import base.SeleniumBase;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class JavaScriptExecutorConcept extends SeleniumBase {

    public static void main(String[] args) throws IOException {
        initialization();
        driver.get("https://www.freecrm.com");
        driver.findElement(By.name("username")).sendKeys("y3te924psx1y");
        driver.findElement(By.name("password")).sendKeys("1t6lxkTddupZ");
        //driver.findElement(By.xpath("//input[@value='Login']")).click();

        //JavascriptExecutor -- is a class and we have to cast driver into JS
        //executeScript -- tp execute JS code

        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));

        flash(loginBtn, driver);//highlight the element

        drawBorder(loginBtn, driver);//draw a border

        // Take screenshot and store as a file format
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // now copy the screenshot to desired location using copyFile //method
        FileHandler.copy(src, new File("C:\\Users\\user\\Desktop\\JavaTraining\\JavaSeleniumWebdriver\\src\\SeleniumSessions\\element.png"));

        //generate alert
        //generateAlert(driver, "There is an issue with Login button on login page");

        //click on any element by using JS executer
        //clickElementByJS(loginBtn, driver);

        //refresh the page:
        //1. by using selenium
        //driver.navigate().refresh();

        //2. by using JS executer
        //refreshBrowserByJS(driver);

        //Get the title of page by JS executer
        //System.out.println(getTitleByJS(driver));

        //Get the page text
        //System.out.println(getPageInnerText(driver));

        //scroll page down
        //scrollPageDown(driver);

        //
        WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(), 'Forgot Password?']"));
        scrollIntoView(forgotPwdLink, driver);

    }

    public static void flash(WebElement element, WebDriver driver) {//used to highlight the elements
        String bgcolor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 10; i++) {
            changeColor("rgb(0,200,0)", element, driver);//1
            changeColor(bgcolor, element, driver);//2
        }
    }

    public static void changeColor(String color, WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void drawBorder(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }

    public static void generateAlert(WebDriver driver, String message) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("alert('" + message + "')");

    }

    public static void clickElementByJS(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", element);

    }

    public static void refreshBrowserByJS(WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("history.go(0)");
    }

    public static String getTitleByJS(WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        return js.executeScript("return document.title;").toString();
    }

    public static String getPageInnerText(WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        return js.executeScript("return document.documentElement.innerText;").toString();
    }

    public static void scrollPageDown(WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public static void scrollIntoView(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }
}
