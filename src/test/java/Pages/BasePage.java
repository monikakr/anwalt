package Pages;

import Helpers.HelperClass;
import Helpers.WaitFunction;
import Helpers.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class BasePage {

        protected WebDriver driver = WebDriverFactory.getWebDriver();
        protected WaitFunction WaitFunctionObject;
        protected HelperClass HelperClassObject;

        public BasePage() {

            WaitFunctionObject = new WaitFunction();
            HelperClassObject = new HelperClass();

        }
    }

