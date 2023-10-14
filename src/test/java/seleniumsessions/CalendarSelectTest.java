package seleniumsessions;

import com.google.qa.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest extends SeleniumBase {

    public static void main(String[] args) throws InterruptedException {
        initialization();
        driver.get("https://www.freecrm.com");
        driver.findElement(By.name("username")).sendKeys("y3te924psx1y");
        driver.findElement(By.name("password")).sendKeys("1t6lxkTddupZ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        driver.switchTo().frame("mainpanel");

        String date = "30-September-2017";
        String[] dateArr = date.split("-");//{6,November,2018}
        String day = dateArr[0];
        String month = dateArr[1];
        String year = dateArr[2];

        Select select = new Select(driver.findElement(By.name("slctMonth")));
        select.selectByVisibleText(month);

        Select select1 = new Select(driver.findElement(By.name("slctYear")));
        select1.selectByVisibleText(year);

        //*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
        //*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
        //*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]

        String before_xpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
        String after_xpath = "]/td[";

        final int totalWeekdays = 7;

        String dayVal;
        boolean flag = false;
        for (int rowNum = 2; rowNum <= 7; rowNum++) {
            for (int colNum = 1; colNum <= totalWeekdays; colNum++) {

                try {
                    dayVal = driver.findElement(By.xpath(before_xpath + rowNum + after_xpath + colNum + "]")).getText();
                } catch (NoSuchElementException e) {
                    System.out.println("Please enter a correct date value");
                    flag = false;
                    break;
                }
                System.out.println(dayVal);

                if (dayVal.equals(day)) {
                    driver.findElement(By.xpath(before_xpath + rowNum + after_xpath + colNum + "]")).click();
                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }
        }
    }
}
