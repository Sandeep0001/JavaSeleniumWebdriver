package com.google.qa.testcases;

import com.google.qa.base.TestBase;
import com.google.qa.pages.GoogleFormPage;
import com.google.qa.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

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
