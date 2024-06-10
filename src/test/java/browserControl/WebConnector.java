package browserControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utilities.ConstantUtils;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WebConnector {

    public static WebDriver driver;



/**
 * Method to open and maximize the browser
 */
        public static void openBrowser() {

            if(ConstantUtils.BROWSER_NAME.equalsIgnoreCase("firefox")){
                FirefoxOptions fo = new FirefoxOptions();
                fo.addArguments("start maximized");
                if (ConstantUtils.BROWSER_TYPE.equalsIgnoreCase("headless")){
                    fo.addArguments("--headless");
                }

                driver = new FirefoxDriver(fo);

            } else {
                ChromeOptions co = new ChromeOptions();
                co.addArguments("start maximized");
                if (ConstantUtils.BROWSER_TYPE.equalsIgnoreCase("headless")){
                    co.addArguments("--headless");
                }

                driver = new ChromeDriver(co);

            }

        //driver = new ChromeDriver();
        //driver.manage().window().maximize();

        //if has tomimplicit wait it had to be here
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    /**
     * method to close browser
     */

    public static void classBrowser(){

        driver.quit();
    }



}
