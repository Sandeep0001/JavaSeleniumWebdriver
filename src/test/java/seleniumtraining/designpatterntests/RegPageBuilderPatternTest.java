package seleniumtraining.designpatterntests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import seleniumwithdesignpatterns.builderpattern.Register;
import seleniumwithdesignpatterns.builderpattern.RegisterPage;

public class RegPageBuilderPatternTest {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
    }

    @Test
    public void userRegTest(){
        Register register1 = new Register.RegisterBuilder()
                .setFirstName("Sandeep")
                .setLastName("S")
                .setEmail("sandeep@test.com")
                .setTelephone("1293984343")
                .setPassword("Test@123")
                .setConfirmPassword("Test@123")
                .build();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.userRegister(register1);
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }

}
