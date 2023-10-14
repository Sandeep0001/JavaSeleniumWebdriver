package seleniumtraining.testngbasics;

import org.testng.annotations.*;

public class TestNgBasics {
	
	/*setup system property for chrome
	launch chrome browser
	login to app
	enter URL
	Google Title Test
	Logout from app
	closeBrowser
	deletaAllCookies
	PASSED: googleTitleTest*/

    //Pre-conditions annotations -- starts with @Before

    @BeforeSuite //1
    public void setUp() {
        System.out.println("@BeforeSuite -- setup system property for chrome");
    }

    @BeforeTest //2
    public void launchBrowser() {
        System.out.println("@BeforeTest -- launch chrome browser");
    }

    @BeforeClass //3
    public void login() {
        System.out.println("@BeforeClass -- login to app");
    }

    @BeforeMethod //4
    public void enterURL() {
        System.out.println("@BeforeMethod -- enter URL");
    }

    /*
     * @BeforeMethod
     * @Test - 1
     * @AfterMethod
     *
     * @BeforeMethod
     * @Test - 2
     * @AfterMethod
     *
     * @BeforeMethod
     * @Test - 3
     * @AfterMethod
     *
     */
    //test cases -- starting with @Test
    @Test //5
    public void googleTitleTest() {
        System.out.println("@Test -- Google Title Test");
    }

    @Test
    public void searchTest() {
        System.out.println("@Test -- search test");
    }

    @Test
    public void googleLogoTest() {
        System.out.println("@Test -- Google Logo Test");
    }

    //Post-conditions -- starting with @After
    @AfterMethod  //6
    public void logOut() {
        System.out.println("@AfterMethod -- Logout from app");
    }

    @AfterClass //7
    public void closeBrowser() {
        System.out.println("@AfterClass -- closeBrowser");
    }

    @AfterTest //8
    public void deletaAllCookies() {
        System.out.println("@AfterTest -- deletaAllCookies");
    }

    @AfterSuite //9
    public void generateTestReport() {
        System.out.println("@AfterSuite -- generateTestReport");
    }
}
