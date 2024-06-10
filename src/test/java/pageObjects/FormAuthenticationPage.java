package pageObjects;

import browserControl.WebConnector;

public class FormAuthenticationPage extends WebConnector {

    /**
     * Locators
     */

    private String usernameFieldXpath = "//input[@id='username']";
    private String passwordFieldXpath="//input[@id='password']";
    private String loginButtonXpath="//button[@type='submit']";
    //private String logoutButtonXpath = "//*[@id=\"content\"]/div/a/i";
    private String logoutButtonXpath = "//a[@href='/logout']";





    /**
     * Getters and setters
     */


    /**
     * Set  username field
     * @param username
     */
    public void setUserName(String username){

    BasePage.findElementByXpath(10, usernameFieldXpath).clear();
    BasePage.findElementByXpath(10, usernameFieldXpath).sendKeys(username);
}

    /**
     * Set password field
     * @param password
     */
    public void setPassWord(String password){

        BasePage.findElementByXpath(10, passwordFieldXpath).clear();
        BasePage.findElementByXpath(10, passwordFieldXpath).sendKeys(password);
    }

    /**
     * click on login button
     */
    public void clickLoginButton(){

        BasePage.findElementByXpath(10, loginButtonXpath).click();

    }

    /**
     * click on logout button
     */
    public void clickLogoutButton(){

        BasePage.findElementByXpath(10, logoutButtonXpath).click();

    }









}
