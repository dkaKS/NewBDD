package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ForgotPasswordPage;
import utilities.ConstantUtils;

import java.time.Duration;

public class ForgotPasswordStepDefinitions extends WebConnector {

    private ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Given("the user navigate to home page")
    public void the_user_navigate_to_home_page() {
        driver.get(ConstantUtils.BASE_URL);
    }

    @Given("the user navigate to {string} page")
    public void the_user_navigate_to_page(String link) {
        driver.findElement(By.linkText(link)).click();

    }

    @When("the user enters {string} in email field")
    public void the_user_enters_in_email_field(String email) throws InterruptedException {
        forgotPasswordPage.enterForgotPasswordEmail(email);
        Thread.sleep(3000);

    }

    @When("the user clicks on Retrieve Password button")
    public void the_user_clicks_on_retrieve_password_button() {
         forgotPasswordPage.clickRetrievePasswordButton();
    }

    @Then("the user sees {string}")
    public void the_user_sees(String expectedText) throws InterruptedException {
    Assert.assertTrue(driver.getPageSource().contains(expectedText) );
    Thread.sleep(3000);
    }

}
