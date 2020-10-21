package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class Hooks {

    protected WebDriver driver;

    @Before
    public void setUp(){

        System.out.println("setUp calisti.");

    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("tearDown calisti.");

        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).
                getScreenshotAs(OutputType.BYTES);

        if(scenario.isFailed()){
            scenario.embed(screenshot , "image/png");
        }

       Driver.closeDriver();

    }

}