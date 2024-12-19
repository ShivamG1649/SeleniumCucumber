package stepDefinitions;
import Utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LoginPageStepDefinition {

   WebDriver driver =TestContext.driver;

//    public LoginPageStepDefinition(TestContext testContext)
//    {
//       this.testContext=testContext;
//    }


    @Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    @When("user enter userName")
    public void user_enter_user_name() {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    }

    @When("user enter password")
    public void user_enter_password() {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

//        driver.findElement(By.name("textInput")).click();
//        driver.findElement(By.id("")).click();
//        driver.findElement(By.className(""));
//        driver.findElement(By.linkText("http://www.orangehrm.com"));

    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("verify that user logged in")
    public void verify_that_user_logged_in() {

        boolean OraneHRMLogo = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
        Assert.assertTrue(OraneHRMLogo);

//         String expectedResult ="Shivam ";
//         String actualResult ="Shivam";
//         Assert.assertEquals(actualResult,expectedResult);

    }

    @When("user enter invalid username")
    public void user_enter_invalid_username() {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin2121212");
    }

    @Then("verify the error message")
    public void verify_the_error_message() {
        boolean status = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed();
        Assert.assertTrue(status);
    }


}
