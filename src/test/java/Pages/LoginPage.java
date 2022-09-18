package Pages;

import Helpers.ElementType;
import org.junit.Assert;

public class LoginPage extends SharedKeywords {

    public void enterEmail(String email) {
        sendKeys("email", ElementType.ID, email);
    }

    public void enterPassword(String password) {
        sendKeys("password", ElementType.ID, password);
    }

    public void clickLogin() {
        click("mms-login-form__login-button", ElementType.ID);
    }

    public void checkURL(){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.mediamarkt.de/de/myaccount/auth/login?redirectURL=%2F" );
    }

    public void acceptCookies() {
        click("pwa-consent-layer-accept-all-button", ElementType.ID);
    }

//    public void validateErrorMessage(String errorMessageId, String errorMessage) {
//        validateByText("BaseTypo-sc-1jga2g7-0 izkVco StyledInfoTypo-sc-1jga2g7-1 iTQkwU StyledCopyText-f1epch-0 keuHoT", ElementType.CLASS, errorMessage);
}

