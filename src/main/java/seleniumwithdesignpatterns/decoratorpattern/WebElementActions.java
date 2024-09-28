package seleniumwithdesignpatterns.decoratorpattern;

import org.openqa.selenium.WebElement;

public class WebElementActions implements WebElementDecorator{
    @Override
    public void click(WebElement element) {
        element.click();
    }

    @Override
    public void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }
}
