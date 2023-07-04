package com.google.qa.testcases;

import com.google.qa.base.TestBase;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrintMinPriceOfTrainTicket extends TestBase {
    @SneakyThrows
    @org.testng.annotations.Test
    public void webTableCheckBoxTest() {
        initialization();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='makeFlex hrtlCenter column']/span[@class='chNavIcon appendBottom2 chSprite chTrains']")).click();
        driver.findElement(By.xpath("//a[@data-cy='submit']")).click();

        List<WebElement> priceList = driver.findElements(By.xpath("//div[@class=\"single-train-detail\"]//div[contains(text(), 'Vande Bharat Ex')]/parent::div/parent::div/following-sibling::div[@class='trainSubsChild']/div//div[@class='ticket-price justify-flex-end']"));

        List<Integer> priceValues = new LinkedList<>();
        for (WebElement ele : priceList) {
            priceValues.add(Integer.parseInt(ele.getText().replace("₹ ", "")));
            System.out.println();
        }
        System.out.println("minimum available ticket price is : " + Collections.min(priceValues));
    }
}

