package com.google.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.qa.base.TestBase;

public class GoogleFormPage extends TestBase {

	//Page Factory
	@FindBy(xpath = "//textarea[contains(@aria-label, 'Question title')]")
	WebElement qtitle;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[contains(@value, 'Option 1')]")
	WebElement op1;
	
	
	@FindBy(xpath = "//input[contains(@aria-label, 'Add option')]")
	WebElement addOpt;
	
	@FindBy(xpath = "//input[contains(@value, 'Option 2')]")
	WebElement op2;
	
	@FindBy(xpath = "//input[contains(@value, 'Option 3')]")
	WebElement op3;
	
	@FindBy(xpath = "//input[contains(@value, 'Option 4')]")
	WebElement op4;
	
	@FindBy(xpath = "//div[contains(@aria-label,'Duplicate item')]")
	WebElement nxtQN;
	
	//Initializing objects
	public GoogleFormPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void createGoogleForm(String qn, String opt1, String opt2, String opt3, String opt4) throws InterruptedException {
		qtitle.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), qn);
		Thread.sleep(1000);
		op1.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), opt1);
		Thread.sleep(1000);
		op2.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), opt2);
		Thread.sleep(1000);
		op3.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), opt3);
		Thread.sleep(1000);
		op4.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), opt4);
		Thread.sleep(1000);
		nxtQN.click();
		Thread.sleep(2000);
	}
}
