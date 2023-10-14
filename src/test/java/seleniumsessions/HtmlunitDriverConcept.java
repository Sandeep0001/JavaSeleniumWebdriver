package seleniumsessions;

import com.google.qa.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlunitDriverConcept extends SeleniumBase {

    public static void main(String[] args) throws InterruptedException {
        initialization();
        //WebDriver driver = new ChromeDriver();

        //html unit driver is not available in 3.x version
        //HTMLUnitDriver --> to use this concept, we have to download htmlunitdriver JAR file
        //advantages
        //1.Testing is happening behind the scene -- no browser is launched
        //2.Very fast -- executation of test cases -- very fast -- performance of the script
        //3. not suitable for actions class -- like mouse movement -- drag and drop
        //4. This is also called Ghost Driver OR Headless Browser
        //HtmlUnitDriver -- java
        //Phanton JS -- JavaScript
        WebDriver driver = new HtmlUnitDriver();
        driver.get("https://www.freecrm.com/index.html");

        System.out.println("Before login title is:" + driver.getTitle());

        driver.findElement(By.name("username")).sendKeys("y3te924psx1y");
        driver.findElement(By.name("password")).sendKeys("1t6lxkTddupZ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(3000);
        System.out.println("After login title is:" + driver.getTitle());
    }
}
