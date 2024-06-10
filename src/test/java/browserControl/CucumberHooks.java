package browserControl;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends WebConnector{

    @Before

    public void setUp(){

        openBrowser();
    }

    @After

    public void tearDown(){

        classBrowser();
    }
}
