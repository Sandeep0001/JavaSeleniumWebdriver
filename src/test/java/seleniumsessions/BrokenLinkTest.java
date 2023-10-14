package seleniumsessions;

import com.google.qa.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinkTest extends SeleniumBase {

    public static void main(String[] args) throws InterruptedException, IOException {
        initialization();
        driver.get("https://makemysushi.com/4047");
//		driver.findElement(By.name("username")).sendKeys("y3te924psx1y");
//		driver.findElement(By.name("password")).sendKeys("1t6lxkTddupZ");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		Thread.sleep(3000);
//
//		driver.switchTo().frame("mainpanel");
//		Thread.sleep(2000);

        //links -- //a
        //images -- //img

        //1. get the list of all the links and  images
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        linkList.addAll(driver.findElements(By.tagName("img")));
        System.out.println("Size of active links and images:---->" + linkList.size());

        List<WebElement> activeLinks = new ArrayList<>();

        //2. Iterate linklist : exclude all the links / images which doesn't have href attributes

        for (WebElement webElement : linkList) {
            System.out.println(webElement.getAttribute("href"));
            if (webElement.getAttribute("href") != null && (!webElement.getAttribute("href").contains("javascript"))) {
                activeLinks.add(webElement);
            }
        }

        //get the size of the active links list:
        System.out.println("Size of active links and images:---->" + activeLinks.size());

        //3. check the href url, with httpconnection api:
        //200 -- ok
        //404 -- not found
        //500 -- internal error
        //400 -- bad request
        for (WebElement activeLink : activeLinks) {
            HttpURLConnection connection = (HttpURLConnection) new URL(activeLink.getAttribute("href")).openConnection();

            connection.connect();
            String response = connection.getResponseMessage();
            connection.disconnect();
            System.out.println(activeLink.getAttribute("href") + "---->" + response);
        }
    }
}
