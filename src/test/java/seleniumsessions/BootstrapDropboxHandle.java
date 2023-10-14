package seleniumsessions;

import com.google.qa.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BootstrapDropboxHandle extends SeleniumBase {

    public static void main(String[] args) {
        initialization();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

        driver.findElement(By.xpath("//button/span[@class='multiselect-selected-text']")).click();

        List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect-container')]//li//a//label"));

        System.out.println(list.size());

        for (WebElement webElement : list) {
            System.out.println(webElement.getText());
            if (webElement.getText().contains("Angular")) {
                webElement.click();
                break;
            }
        }
    }
}
