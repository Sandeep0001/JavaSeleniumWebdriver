package seleniumtraining;

import base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox extends SeleniumBase {

    public static void main(String[] args) {
        initialization();
        driver.get("https://www.roboform.com/filling-test-all-fields");

        //handle drop box
        //firstly we need to create select object and import the library
        Select select = new Select(driver.findElement(By.name("40cc__type")));
        select.selectByVisibleText("Master Card");
    }
}
