package seleniumwithdesignpatterns.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {

    private static volatile WebDriverManager instance;
    private static final ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>(); //To achieve parallel execution across browsers we have to use ThreadLocal
    //ThreadLocal has set and get methods
    private WebDriverManager(){}

    private void initDriver(String browser){
        switch (browser) {
            case "chrome" -> tlDriver.set(new ChromeDriver());
            case "firefox" -> tlDriver.set(new FirefoxDriver());
            case "edge" -> tlDriver.set(new EdgeDriver());
            default -> throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }

    public static WebDriverManager getInstance(String browser){
        if (instance == null) {
            synchronized (WebDriverManager.class){
                if (instance == null){
                    instance = new WebDriverManager();
                }
            }
        }

        if (tlDriver.get() == null){
            instance.initDriver(browser);
        }
        return instance;
    }

    public WebDriver getDriver(){
        return tlDriver.get();
    }

    public static void quitBrowser(){
        if (tlDriver.get() != null){
            tlDriver.get().quit();
            tlDriver.remove();
        }
    }

}
