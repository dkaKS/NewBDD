package pageObjects;

import browserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxPage extends WebConnector {

    /**Locators**/

    private String chkBoxOneXpath = "//form[@id='checkboxes']//input[@type='checkbox'][1]";
    private String chkBoxTwoXpath = "//form[@id='checkboxes']//input[@type='checkbox'][2]";
    //private String clearDefaultChkBxXpath = "//form[@id='checkboxes']//input[@type='checkbox' and @checked]";


    /**Getter and Setter**/

    public void clearDefaultChkBx(){
        WebElement checkboxes = driver.findElement(By.xpath("//form[@id='checkboxes']//input[@type='checkbox' and @checked]"));
        checkboxes.click();

    }

    public void checkboxOneSelected(){

        //select checkbox option 1
        WebElement chkBxOne = driver.findElement(By.xpath(chkBoxOneXpath));
        chkBxOne.click();


    }
    public void checkboxTwoSelected(){
        WebElement chkBxTwo = driver.findElement(By.xpath(chkBoxTwoXpath));
        chkBxTwo.click();

    }




}
