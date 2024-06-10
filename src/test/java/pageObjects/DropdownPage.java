package pageObjects;

import browserControl.WebConnector;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage extends WebConnector {

    /**locators**/

    private String dropDownXpath = "//select[@id='dropdown']";
    private String selectedOptionXpath = "//option[@selected='selected']";


    /**
     * Getters and setters
     * /

     /*
     * Method to check the umber of options available in the dropdown box
     */

    public void checkNumberOfOptions(int expectedCount){
        WebElement dropdown = BasePage.findElementByXpath(10, dropDownXpath);
        List<WebElement> options = dropdown.findElements(By.tagName("option"));
        Assert.assertEquals(expectedCount, options.size());

    }

    /**
     * Method to select a given option from the dropdown
     * @param option
     */
    public void selectOptionFromDropdown(String option){
        WebElement dropdown = BasePage.findElementByXpath(10, dropDownXpath);
        //dropdown.sendKeys(option); (This can be used to select an option from dropdown)
        //In this case the element has 'Select' tag so we will use Select class
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);
    }

    /**
     * Method to check the selected option
     * @param expectedOption
     */
    public void checkSelectedOption(String expectedOption){
         String actualOption = BasePage.findElementByXpath(10, selectedOptionXpath).getText();
         Assert.assertEquals(expectedOption, actualOption);

    }

}
