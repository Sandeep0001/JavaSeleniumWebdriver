package testcases;

import base.SeleniumBase;
import pages.GoogleFormPage;
import pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends SeleniumBase {

    LoginPage loginPage;
    GoogleFormPage googleFormPage;

    public LoginPageTest() {
        super();//calls base class constructor
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test
    public void loginTest() throws InterruptedException {
        googleFormPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
