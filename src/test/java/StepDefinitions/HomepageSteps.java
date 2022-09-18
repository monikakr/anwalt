package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageSteps extends BaseSteps {

    @And("^I click on Outlet")
    public void clickOutlet() throws InterruptedException {
        Thread.sleep(4000);
        homePageObject.clickOutlet();}

    @Then("^I see Outlet page")
        public void outletPage(){
        homePageObject.validateOutletPage();
    }
}
