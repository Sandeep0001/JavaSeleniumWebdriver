package seleniumsessions;

import com.google.qa.base.SeleniumBase;

public class CustomXpath extends SeleniumBase {

    public static void main(String[] args) {
        initialization();
        driver.get("https://www.ebay.com/");
        //Never use absolute xpath i.e; //*[@id='gh-ac']/div/div[2]/table/input
        //Disadvantages of using absolute xpath is
        //1. performance issue
        //2. Not reliable
        //3. Can be changed at any time in future

        //Use customized xapth
        //1.
        //driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("Java");

        //2.
        //driver.findElement(By.xpath("//input[contains(@class, 'gh-tb')]")).sendKeys("Java");//contains can be used to solve dynamic id values
        //ex for dynamic id
        //id = test_123 //input tag
        //after page refresh id = test_456
        //for the above dynamic values use contains function in xpath or starts-with function

        //driver.findElement(By.xpath("//input[contains(@id, 'test_')]")).sendKeys("Test");

        //3.
        //driver.findElement(By.xpath("//input[starts-with(@id, 'test_')]")).sendKeys("Test");

        //4.
        //id = 1234_test_t
        //id = 4587_test_t // for this kind of dynamic values we can use contains function or the below one
        //driver.findElement(By.xpath("//input[ends-with(@id, '_test_t')]")).sendKeys("Test");

        //5. -- click on links using xpath
        //all the links are represented by <a> html tag
        // text() is a function so don't use @text
        //driver.findElement(By.xpath("//a[contains(text(), 'My Account')]")).click();
    }
}
