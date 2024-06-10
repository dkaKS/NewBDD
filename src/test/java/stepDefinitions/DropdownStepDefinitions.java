package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DropdownPage;

public class DropdownStepDefinitions extends WebConnector {

    DropdownPage dropdownPage =new DropdownPage();

    @Then("the user should see {int} options in the dropdown box")
    public void the_user_should_see_three_options_in_the_dropdown_box(int count) {
    dropdownPage.checkNumberOfOptions(count);

    }

    @When("the user select {string} option from the dropdown")
    public void the_user_select_option_from_the_dropdown(String option) {
         dropdownPage.selectOptionFromDropdown(option);
    }

    @Then("the user should see {string} option is selected in the dropdown")
    public void the_user_should_see_option_is_selected_in_the_dropdown(String option) {
      dropdownPage.checkSelectedOption(option);
    }




}
