package seleniumsessions;

import com.google.qa.base.SeleniumBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenshotConcept extends SeleniumBase {

    public static void main(String[] args) throws IOException {
        initialization();
        driver.get("https://www.google.com");

        // Take screenshot and store as a file format
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // now copy the screenshot to desired location using copyFile //method
        FileHandler.copy(src, new File("C:\\Users\\user\\Desktop\\JavaTraining\\JavaSeleniumWebdriver\\src\\SeleniumSessions\\google.png"));
    }
}
