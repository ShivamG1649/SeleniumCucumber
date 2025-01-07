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

import java.util.List;

public class LoginPageStepDefinition {

    WebDriver driver = TestContext.driver;

//    public LoginPageStepDefinition(TestContext testContext)
//    {
//       this.testContext=testContext;
//    }


    @Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @Then("Verify title of the page")
    public void verify_title_of_the_page() {
        String expectedTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
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

    @When("user enter invalid password")
    public void user_enter_invalid_password() {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin1234");
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
        boolean OraneHRMLogo = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
        Assert.assertTrue(OraneHRMLogo);
    }

    @When("User clicked Forgot Your Password link")
    public void user_clicked_forgot_your_password_link() {
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
    }

    @When("Verify user navigated to Reset Password page")
    public void verify_user_navigated_to_reset_password_page() {
        String expectedTitle = "Reset Password";
        String actualTitle = driver.findElement(By.xpath("//h6[text()='Reset Password']")).getText();
        Assert.assertEquals(actualTitle, expectedTitle, "title is not matched");
        System.out.println("User successfully navigated to Reset Password page");
    }

    @When("User enter {string} and click on Reset password")
    public void user_enter_and_click_on_reset_password(String string) {
        driver.findElement(By.name("username")).sendKeys(string);
        driver.findElement(By.xpath("//button[text()=' Reset Password ']")).click();
    }

    @When("Verify User navigated to Reset password Successful page")
    public void verify_user_navigated_to_reset_password_successful_page() {
        String expectedTitle = "Reset Password link sent successfully";
        String actualTitle = driver.findElement(By.xpath("//h6[text()='Reset Password link sent successfully']")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("User successfully navigated to Reset Password link sent successfully page");
    }

    @When("^user enter \"(.*?)\" and \"(.*?)\"$")
    public void user_enter(String username ,String password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
    }


}
