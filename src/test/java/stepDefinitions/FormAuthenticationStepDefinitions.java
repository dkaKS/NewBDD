package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FormAuthenticationPage;

public class FormAuthenticationStepDefinitions extends WebConnector {
    FormAuthenticationPage formAuthPage = new FormAuthenticationPage();





    @When("the user login with {string} in username and {string} in password")
    public void the_user_login_with_in_username_and_in_password(String username, String password) {
        formAuthPage.setUserName(username);
        formAuthPage.setPassWord(password);
        formAuthPage.clickLoginButton();

    }
    @Then("the user click on logout button")
    public void the_user_click_on_button() {
        formAuthPage.clickLogoutButton();

    }

    @Then("the user should {string}")
    public void the_user_should(String string) {

    }
}
