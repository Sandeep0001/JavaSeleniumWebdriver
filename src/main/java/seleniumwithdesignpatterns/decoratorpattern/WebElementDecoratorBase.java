package seleniumwithdesignpatterns.decoratorpattern;

import org.openqa.selenium.WebElement;

//adding abstract so that no one can create object of this class
public abstract class WebElementDecoratorBase implements WebElementDecorator{

    protected WebElementDecorator decoratedElement;

    public WebElementDecoratorBase(WebElementDecorator decoratedElement){
        this.decoratedElement = decoratedElement;
    }

    @Override
    public void click(WebElement element) {
        decoratedElement.click(element);
    }

    @Override
    public void sendKeys(WebElement element, String text) {
        decoratedElement.sendKeys(element, text);
    }
}
