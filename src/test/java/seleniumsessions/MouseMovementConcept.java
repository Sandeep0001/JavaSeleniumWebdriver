package seleniumsessions;

import com.google.qa.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept extends SeleniumBase {
    /*Mouse Actions in Selenium:

    doubleClick(): Performs double click on the element
    clickAndHold(): Performs long click on the mouse without releasing it
    dragAndDrop(): Drags the element from one point and drops to another
    moveToElement(): Shifts the mouse pointer to the center of the element
    contextClick(): Performs right-click on the mouse
    Keyboard Actions in Selenium:

    sendKeys(): Sends a series of keys to the element
    keyUp(): Performs key release
    keyDown(): Performs keypress without release*/

    public static void main(String[] args) throws InterruptedException {
        initialization();
        driver.get("https://www.spicejet.com/");
        WebElement element = driver.findElement(By.id("highlight-addons"));

        Actions action = new Actions(driver);//to perform mouse movements we have to create Actions class object reference.

        //.build().perform(); -- is a method which will perform the action
        action.moveToElement(element).build().perform();
        Thread.sleep(3000);    //static wait
        driver.findElement(By.linkText("Priority Check-in")).click();

        //to perform doubleClick
        action.doubleClick(element).perform();
    }
}
