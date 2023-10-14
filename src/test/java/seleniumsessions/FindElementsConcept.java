package seleniumsessions;


import com.google.qa.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElementsConcept extends SeleniumBase {

    public static void main(String[] args) {
        initialization();
        driver.get("https://www.ebay.com/");

        //1. how to get total count of links on the page
        //2. how to get the text of each link on the page

        List<WebElement> linkList = driver.findElements(By.tagName("a"));//tagName is a locator

        //size of linkList
        System.out.println(linkList.size());

        for (WebElement webElement : linkList) {
            System.out.println(webElement.getText());
        }
    }
}
