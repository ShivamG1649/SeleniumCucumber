package stepDefinitions;
import Utils.TestContext;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DashBoardStepDefinition {

  TestContext testContext;
    public DashBoardStepDefinition(TestContext testContext){
        this.testContext=testContext;
    }

    @When("verify that all quick icons available on dashBoard page")
    public void verify_allIcons()
    {
        // Verification code should be here

        ArrayList<String> ExpectedQuickIcons = new ArrayList<>(Arrays.asList("Assign Leave", "Leave List", "Timesheets", "Apply Leave", "My Leave", "My Timesheet"));

        List<WebElement> ActualiconList =testContext.driver.findElements(By.xpath("//div[@class='orangehrm-quick-launch-heading']"));
        int j =0;
        for (WebElement i : ActualiconList)
        {
            String expectedIcon=  ExpectedQuickIcons.get(j);
            String actualIcon =i.getText();
            j=j+1;
            Assert.assertEquals(actualIcon,expectedIcon);
        }

    }

    }


