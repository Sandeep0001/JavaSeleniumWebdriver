package seleniumsessions;

import com.google.qa.base.SeleniumBase;
import org.openqa.selenium.By;

public class HandleFileUploadPopUp extends SeleniumBase {

    //Different types of popUps:
    //1. alerts --> Javascript popUp --> Alert API (accept, dismiss)
    //2. File Upload popUp --> Browse button (type="file", sendKeys(path))
    //3. Browser window pop up -->  Advertisement pop up (windowHandler API - getWindowHandles())

    public static void main(String[] args) throws InterruptedException {
        initialization();
        driver.get("https://html.com/input-type-file/");
        Thread.sleep(10000);
        driver.findElement(By.linkText("�")).click();
        Thread.sleep(6000);
        //type="file" should be present for Browse/attachFile/UploadFile button
        driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\user\\Downloads\\extr.html");
    }
}
