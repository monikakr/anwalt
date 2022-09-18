package StepDefinitions;

import Helpers.HelperClass;
import Helpers.WaitFunction;
import Helpers.WebDriverFactory;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SharedKeywords;
import org.openqa.selenium.WebDriver;

public class BaseSteps {
    protected WebDriver driver = WebDriverFactory.getWebDriver();
    protected WaitFunction WaitFunctionObject;
    protected SharedKeywords sharedKeywordsObject;
    protected HelperClass helperClassObject;
    protected LoginPage loginPageObject;
    protected HomePage homePageObject;

    public BaseSteps() {
        this.WaitFunctionObject = new WaitFunction();
        this.loginPageObject = new LoginPage();
        this.homePageObject = new HomePage();
        this.sharedKeywordsObject = new SharedKeywords();
        this.helperClassObject = new HelperClass();
    }
}
