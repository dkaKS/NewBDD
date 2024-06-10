package pageObjects;

import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgotPasswordPage extends WebConnector {

    /*****************Locators*************/

    private String emailFieldXpath="//input[@id='email']";
    private String retrievePasswordButton= "//button[@id='form_submit']";



    /************Getters and setters **********/
    /**
     * Method to enter given email in the email field
     * @param email
     */

    public void enterForgotPasswordEmail(String email){
        WebElement emailField = BasePage.findElementByXpath(10, emailFieldXpath);
        emailField.clear();
        emailField.sendKeys(email);
    }

    /**
     * Method to click on retrieve password button
     */
    public void clickRetrievePasswordButton(){
        BasePage.findElementByXpath(10, retrievePasswordButton).click();
    }

}
