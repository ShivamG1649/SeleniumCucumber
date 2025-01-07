package stepDefinitions;
import utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

public class HomePageStepDefinition {
    TestContext testContext;
    // Constructor creation
    public HomePageStepDefinition(TestContext testContext){
        this.testContext=testContext;
    }


    @Given("user is logged in")
    public void user_is_logged_in() {
        WebDriverManager.chromedriver().setup();
        testContext.driver = new ChromeDriver();
        testContext.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        testContext.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        testContext.driver.manage().window().maximize();
        testContext.driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        testContext.driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        testContext.driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("verify the quick launch icons on dashBoard page")
    public void verify_the_quick_launch_icons_on_dash_board_page() {

        ArrayList<String> ExpectedQuickFields = new ArrayList<>(Arrays.asList("Assign Leave", "Leave List", "Timesheets","Apply Leave","My Leave","My Timesheet"));

        // Creation of dynamic locator

        for( String i:ExpectedQuickFields){
            String xpath = "//div[@title ='i']";
            WebElement element = testContext.driver.findElement(By.xpath("//div[@title ='" + i + "']"));
            boolean status=element.isDisplayed();
            Assert.assertTrue(status);
        }

    }
}
