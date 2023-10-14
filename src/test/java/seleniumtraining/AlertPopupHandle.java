package seleniumtraining;

import base.SeleniumBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertPopupHandle extends SeleniumBase {

    public static void main(String[] args) throws InterruptedException {
        initialization();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.name("proceed")).click();//clicking on go btn
        Thread.sleep(5000);//to sleep for 5 sec

        //we have to use Alert API to switch -- method name is switchTo().alert();
        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());
        //validation part
        String text = alert.getText();

        if (text.equals("Please enter a valid user name")) {
            System.out.println("Correct Text");
        } else {
            System.out.println("Incorrect Text");
        }

        alert.accept();//click on ok
        //alert.dismiss();//click on cancel
    }
}
