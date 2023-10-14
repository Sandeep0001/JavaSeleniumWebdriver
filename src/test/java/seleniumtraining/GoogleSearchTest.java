package seleniumtraining;

import base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchTest extends SeleniumBase {

    public static void main(String[] args) {
        initialization();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");

        //Descendant will give the list of all child elements of given tag
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));

        System.out.println("total number of suggestion in search box:" + list.size());

        for (WebElement webElement : list) {
            System.out.println(webElement.getText());
            if (webElement.getText().contains("testing tools")) {
                webElement.click();
                break;
            }
        }
    }
}
