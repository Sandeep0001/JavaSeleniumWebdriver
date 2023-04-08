package com.google.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.qa.base.TestBase;
import com.google.qa.pages.GoogleFormPage;
import com.google.qa.pages.LoginPage;
import com.google.qa.util.TestUtil;

public class GoogleFormPageTest extends TestBase{

	GoogleFormPage googleFormPage;
	LoginPage loginPage;
	TestUtil testUtil;
	
	String sheetName = "SoftvisionAssessment";
	
	public GoogleFormPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() throws InterruptedException{

		initialization();
		loginPage = new LoginPage();
		googleFormPage = new GoogleFormPage();
		googleFormPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil = new TestUtil();
	}
	
	@DataProvider
	public Object[][] getGoogleTestData(){

		Object data[][] = TestUtil.getTestData(sheetName);

		return data;

	}
	
	@Test(dataProvider = "getGoogleTestData")
	public void createGoogleFormTest(String question, String option1, String option2, String option3, String option4) throws InterruptedException {
		googleFormPage.createGoogleForm(question, option1, option2, option3, option4);
	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
