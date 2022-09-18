package Pages;

import Helpers.ElementType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

public class SharedKeywords extends BasePage{

    public WebElement getElementBy(String theElement, ElementType elementType) {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        switch (elementType) {
            case XPATH:
                return driver.findElement(By.xpath(theElement));
            case ID:
                return driver.findElement(By.id(theElement));
            case CSS:
                return driver.findElement(By.cssSelector(theElement));
            case NAME:
                return driver.findElement(By.name(theElement));
            case LABEL:
                return driver.findElement(By.xpath(String.format(theElement)));
            case CLASS:
                return driver.findElement(By.className(String.format(theElement)));
        }
        return null;

    }

    public void sendKeys(String theElement, ElementType elementType,String elementValue) {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement element = getElementBy(theElement,elementType);
        element.clear();
        element.sendKeys(elementValue);
        HelperClassObject.systemPause(1000);
    }

    public void click(String theElement, ElementType elementType) {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        getElementBy(theElement,elementType).click();
        HelperClassObject.systemPause(1000);
    }

    public void validateByText(String theElement, ElementType elementType,String text){
        String message = getElementBy(theElement,elementType).getText();
        System.out.println(message);
        String expectedMessage = text;
        assertTrue(message.contains(expectedMessage));
    }

}
