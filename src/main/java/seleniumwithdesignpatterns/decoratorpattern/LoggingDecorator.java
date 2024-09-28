package seleniumwithdesignpatterns.decoratorpattern;

import org.openqa.selenium.WebElement;

public class LoggingDecorator extends WebElementDecoratorBase{
    public LoggingDecorator(WebElementDecorator decoratedElement) {
        super(decoratedElement);
    }

    @Override
    public void click(WebElement element) {
        System.out.println("Clicking on element: "+ element);
        decoratedElement.click(element);
    }

    @Override
    public void sendKeys(WebElement element, String text) {
        System.out.println("Entering '" + text + "' into element"+ element);
        decoratedElement.sendKeys(element, text);
    }
}
