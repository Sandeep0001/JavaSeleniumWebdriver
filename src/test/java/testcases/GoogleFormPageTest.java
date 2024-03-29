package testcases;

import base.SeleniumBase;
import pages.GoogleFormPage;
import pages.LoginPage;
import util.TestUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleFormPageTest extends SeleniumBase {

    GoogleFormPage googleFormPage;
    LoginPage loginPage;
    TestUtil testUtil;

    String sheetName = "SoftvisionAssessment";

    public GoogleFormPageTest() {
        super();
    }

    @BeforeClass
    public void setUp() throws InterruptedException {
        initialization();
        driver.get(prop.getProperty("url"));
        loginPage = new LoginPage();
        googleFormPage = new GoogleFormPage();
        googleFormPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        testUtil = new TestUtil();
    }

    @DataProvider
    public Object[][] getGoogleTestData() {
        return TestUtil.getTestData(sheetName);
    }

    @Test(dataProvider = "getGoogleTestData")
    public void createGoogleFormTest(String question, String option1, String option2, String option3, String option4) throws InterruptedException {
        googleFormPage.createGoogleForm(question, option1, option2, option3, option4);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
