package seleniumsessions;

import com.google.qa.base.SeleniumBase;
import org.openqa.selenium.By;

public class LocatorConcept extends SeleniumBase {

    public static void main(String[] args) {
        initialization();
        driver.get("https://dnt.abine.com/#/register");

        //There are 8 locators in selenium
        //1. xpath --2
        //absolute xpath should not be used -- html/body/div[1]/div[5]/div[7]/a
        //only relative xpath should be used -- //*[@id='email']
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@def.com");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id='password-confirmation']")).sendKeys("123");

        //2. id -- 1st priority
        driver.findElement(By.id("email")).sendKeys("abc@def.com");
        driver.findElement(By.id("password")).sendKeys("1234");

        //3. name -- 3
        driver.findElement(By.name("user[email]")).sendKeys("abc@def.com");
        driver.findElement(By.name("user[password]")).sendKeys("1234");

        //4. linkText -- this is only for links --1
        driver.findElement(By.linkText("Terms of Service")).click();

        //5. partiallinkTest : not recommended : not useful too
        driver.findElement(By.partialLinkText("Privacy")).click();

        //6.CSSSelector -- 2
        //if id is there -- #[id]
        //if class is there -- .[class]
        driver.findElement(By.cssSelector("#email")).sendKeys("abc@def.com");

        //7. class name: not recommended : no useful too because class name can be duplicate. -- 4
        driver.findElement(By.className("form-control")).sendKeys("abc@def.com");

        //8. TagName
        driver.findElement(By.tagName("a"));

        //selenium 4 relative locators
        /*above(): sought-after element appears above specified element
        below(): sought-after element appears below specified element
        toLeftOf(): sought-after element appears to the left of specified element
        toRightOf(): sought-after element appears to the right of specified element
        near(): sought-after element is at most 50 pixels away from specified element. There’s also an overloaded method to allow you to specify the distance.*/
        //example
        //driver.findElement(withTagName("li").toLeftOf(By.id("pid6")).below(By.id("pid1"))).getAttribute("id");
    }
}
