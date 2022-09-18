package StepDefinitions;

import Pages.BasePage;
import UiMaps.SharedUIMaps;
import io.cucumber.java.de.Aber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends BaseSteps {
    @Given("^Navigate to '(.*)' url.$")
    public void LoginIntoApplication(String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
    @When("^I accept cookies")
    public void acceptCookies() throws InterruptedException {
        Thread.sleep(5000);
        loginPageObject.acceptCookies();}

    @And("^I enter valid email")
    public void iEnterValidEmail() throws InterruptedException {
        loginPageObject.enterEmail(SharedUIMaps.validEmail);
        Thread.sleep(3000);}


    @And("^I enter invalid password")
    public void iEnterInvalidPassword() throws InterruptedException {
        loginPageObject.enterPassword(SharedUIMaps.invalidPassword);
        Thread.sleep(3000);}

    @And("^I click login")
    public void iClickLogin() throws InterruptedException {
        Thread.sleep(3000);
        loginPageObject.clickLogin();}

    @Then("^I stay on the same page")
    public void invalidLogin(){
        loginPageObject.checkURL();}
    }
//    public void errorMessage(){
//        loginPageObject.validateErrorMessage("BaseTypo-sc-1jga2g7-0 izkVco StyledInfoTypo-sc-1jga2g7-1 iTQkwU StyledCopyText-f1epch-0 keuHoT",SharedUIMaps.errorMessage);




