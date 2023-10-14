package seleniumtraining;

import base.SeleniumBase;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class HandleWindowPopup extends SeleniumBase {

    public static void main(String[] args) {
        initialization();
        driver.get("http://www.popuptest.com/goodpopups.html");
        driver.findElement(By.xpath("//a[contains(text(), 'Good PopUp #3')]")).click();

        Set<String> handler = driver.getWindowHandles();//to get window id

        Iterator<String> it = handler.iterator();//in java the Set object will not store values in indexes so use iterator.

        String parentWindowId = it.next();//It will give the value of first / parent window
        System.out.println("parent window id:" + parentWindowId);

        String childWindowId = it.next();
        System.out.println("Child window id:" + childWindowId);

        driver.switchTo().window(childWindowId);

        System.out.println("child window popup title:" + driver.getTitle());

        driver.close();

        driver.switchTo().window(parentWindowId);

        System.out.println("parent window title:" + driver.getTitle());
    }
}
