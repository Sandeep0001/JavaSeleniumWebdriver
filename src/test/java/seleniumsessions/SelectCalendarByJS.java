package seleniumsessions;

import com.google.qa.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCalendarByJS extends SeleniumBase {

    public static void main(String[] args) {
        initialization();
        driver.get("https://www.spicejet.com/");

        WebElement element = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
        String dateVal = "30-11-2018";
        selectDateByJS(driver, element, dateVal);

    }

    public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].setAttribute('value','" + dateVal + "');", element);
    }
}
