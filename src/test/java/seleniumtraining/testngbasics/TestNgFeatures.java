package seleniumtraining.testngbasics;

import org.testng.annotations.Test;

public class TestNgFeatures {

    @Test
    public void loginTest() {
        System.out.println("Login Test");
        //int i = 9/0;
    }

    @Test(dependsOnMethods = "loginTest")
    public void homePageTest() {
        System.out.println("home Page Test");
    }

    @Test(dependsOnMethods = "loginTest")
    public void searchPageTest() {
        System.out.println("search Page Test");
    }

    @Test(dependsOnMethods = "loginTest")
    public void regPageTest() {
        System.out.println("reg Page Test");
    }
}
