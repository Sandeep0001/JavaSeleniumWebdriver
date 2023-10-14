package seleniumtraining;

import base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept extends SeleniumBase {

    public static void main(String[] args) {
        initialization();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
    }
}
