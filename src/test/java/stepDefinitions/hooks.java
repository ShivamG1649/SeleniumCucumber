package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.TestContext;

import java.io.File;
import java.io.IOException;

public class hooks {
TestContext testContext;
public hooks(TestContext testContext){
    this.testContext=testContext;
    }
    // Before running each and every test Cases, we can also provide tags in with the hooks
    @Before()
    public void beforeAllTestCases(){
        System.out.println("***************************************************");
        System.out.println("before all test cases");
    }

    @Before("@Smoke")
    public void allPreconditions(){
        System.out.println("***************************************************");
        System.out.println("before all smoke test cases");
    }

    @Before("@DataBaseTestCase")
    public void dateBaseSetUp(){
        System.out.println("********************************************************");
        System.out.println("DataBase setUp for data baseTesting");
    }

    @After
    public void tearDown() throws IOException {
       testContext.baseTest.webDriverManager().quit();
    }

    @AfterStep
    public void takeScreenShotOnFailure(Scenario scenario) throws IOException {

        WebDriver driver =testContext.baseTest.webDriverManager();

       if(scenario.isFailed()){
           File sourcefile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           byte[] fileContent= FileUtils.readFileToByteArray(sourcefile);
           scenario.attach(fileContent,"image/png","Image");
        }
    }
}
