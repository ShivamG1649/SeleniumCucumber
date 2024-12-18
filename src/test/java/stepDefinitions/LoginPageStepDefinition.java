package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LoginPageStepDefinition {

    public WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException
    {
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
    }
     @When("user click on login button")
    public void user_click_on_login_button() {
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
     @Then("verify that user logged in")
    public void verify_that_user_logged_in() {

       boolean OraneHRMLogo= driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
    Assert.assertTrue(OraneHRMLogo);

       String expectedResult ="Shivam ";
         String actualResult ="Shivam";
         Assert.assertEquals(actualResult,expectedResult);

    }

}






