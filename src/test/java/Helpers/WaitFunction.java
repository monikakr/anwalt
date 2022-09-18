package Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;

public class WaitFunction extends WebDriverFactory {

    protected WebDriver driver = WebDriverFactory.getWebDriver();


    WebDriverWait wait = new WebDriverWait(driver, 20);

    public void WaitForElementByID(String element){

        wait.until(ExpectedConditions.elementToBeClickable(By.id(element)));
    }

    public void WaitForElementByClassName(String element){

        wait.until(ExpectedConditions.elementToBeClickable(By.className(element)));
    }

    public static int generateRandomInt(int upperRange){
        Random random = new Random();
        return random.nextInt(upperRange);
    }
}
