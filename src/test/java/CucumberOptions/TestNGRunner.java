package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue ="stepDefinitions",tags = "@OrangeHRM7", monochrome = true )

public class TestNGRunner extends AbstractTestNGCucumberTests {


}
