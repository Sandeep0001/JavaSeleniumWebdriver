package com.google.qa.pages;

import com.google.qa.base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@type='email']")
    WebElement email;

    @FindBy(xpath = "//span[contains(text(), 'Next')]")
    WebElement next;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(xpath = "//div[@id=':1d']")
    WebElement blankPage;

    @FindBy(xpath = "//textarea[contains(@aria-label, 'Form title')]")
    WebElement title;

    @FindBy(xpath = "//input[contains(@aria-label, 'Add option')]")
    WebElement addOpt;

    @FindBy(xpath = "//textarea[contains(@aria-label, 'Question title')]")
    WebElement qtitle;

    // Initializing objects
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    // Actions
    public GoogleFormPage login(String un, String pwd) throws InterruptedException {
        email.sendKeys(un);
        next.click();
        Thread.sleep(1000);
        password.sendKeys(pwd);
        next.click();
        Thread.sleep(1000);
        blankPage.click();
        Thread.sleep(1000);
        title.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "Softvision Assessment");
        Thread.sleep(1000);
        qtitle.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), "Q");
        addOpt.click();
        addOpt.click();
        addOpt.click();
        return new GoogleFormPage();
    }
}
