package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckboxPage;

public class CheckboxStepDefinitions extends WebConnector {

    CheckboxPage checkboxPage =new CheckboxPage();

    @When("the user clears the default checkbox")
    public void the_user_clears_the_default_checkbox() {
        checkboxPage.clearDefaultChkBx();

    }
    @Then("the user clicks checkbox one")
    public void the_user_clicks_checkbox_one() {
        checkboxPage.checkboxOneSelected();

    }

    @Then("the user clicks checkbox Two")
    public void the_user_clicks_checkbox_two() {
        checkboxPage.checkboxTwoSelected();

    }

}
