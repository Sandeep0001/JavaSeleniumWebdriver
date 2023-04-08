package com.google.qa.testcases;

import com.google.qa.base.TestBase;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends TestBase {

    @SneakyThrows
    @Test
    public void webTableCheckBoxTest(){
        initialization();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        Thread.sleep(5000);
        List<WebElement> englishSpeakingCountriesList = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td[contains(text(), 'English')]/preceding-sibling::td/input[@class='hasVisited']"));

        for (WebElement englishSpeakingCountry : englishSpeakingCountriesList){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(234,694)", "");
            englishSpeakingCountry.click();
        }
    }
}
