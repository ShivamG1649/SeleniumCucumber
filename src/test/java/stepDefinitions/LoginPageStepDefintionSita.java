package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageStepDefintionSita {

    WebDriver driver=LoginPageStepDefinition.driver;

    @When("user enter invalid password")
    public void user_enter_invalid_password() {
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin1234");
    }

    @Then("verify the error message")
    public void verify_the_error_message() {

        boolean errorMsg=driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed();
        Assert.assertTrue(errorMsg);
        System.out.println("Invalid password is given");
    }
}