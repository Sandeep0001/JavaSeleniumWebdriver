package seleniumtraining;

import base.SeleniumBase;
import org.openqa.selenium.By;

public class ElementVisibilityTest extends SeleniumBase {

    public static void main(String[] args) {
        initialization();
        driver.get("https://www.freecrm.com/register/");

        //1.isDisplayed() method: applicable for all the elements
        boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed();
        System.out.println(b1);//true

        //2. isEnabled() method:
        boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
        System.out.println(b2);//false

        //Select I agree checkbox
        driver.findElement(By.name("agreeTerms")).click(); //sub,it button is enabled
        boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
        System.out.println(b3);//true

        //3. isSelected() method: only applicable for checkbox, dropdown, radioButton
        boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
        System.out.println(b4);//true

        //deselect the checkbox
        driver.findElement(By.name("agreeTerms")).click();
        boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
        System.out.println(b5);//false
    }
}
