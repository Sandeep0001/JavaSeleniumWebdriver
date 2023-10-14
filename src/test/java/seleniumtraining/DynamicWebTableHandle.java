package seleniumtraining;

import base.SeleniumBase;
import org.openqa.selenium.By;

public class DynamicWebTableHandle extends SeleniumBase {

    public static void main(String[] args) throws InterruptedException {
        initialization();
        driver.get("https://www.freecrm.com");
        driver.findElement(By.name("username")).sendKeys("y3te924psx1y");
        driver.findElement(By.name("password")).sendKeys("1t6lxkTddupZ");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(3000);

        driver.switchTo().frame("mainpanel");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();

        //*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
        //*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]/a
        //*[@id="vContactsForm"]/table/tbody/tr[6]/td[2]/a
        //*[@id="vContactsForm"]/table/tbody/tr[7]/td[2]/a

        //Method 1:
//		String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
//		String after_xpath = "]/td[2]/a";
//		
//		for(int i=4;i<=7;i++){
//			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
//			System.out.println(name);
//			if(name.contains("Tom Din")){
//				//*[@id="vContactsForm"]/table/tbody/tr[6]/td[1]/input
//				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
//			}
//		}

        //Method 2:
        driver.findElement(By.xpath("//a[contains(text(), 'Test2 T')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Tom Din')]/parent::td/preceding-sibling::td/input[@name='contact_id']")).click();
    }
}
