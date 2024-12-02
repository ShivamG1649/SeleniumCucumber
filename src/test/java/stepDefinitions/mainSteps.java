package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LandingPage;

public class mainSteps {

    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.shutterfly.com/");
//        LandingPage landingPage = new LandingPage(driver);
//        landingPage.enterUserName(userName);

        driver.manage().window().maximize();
         Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asdada");
    }
    @When("user login into application")
    public void user_login_into_application() {
        System.out.println("Enter username and password");
    }
    @Then("home page is displayed")
    public void home_page_is_displayed() {
        System.out.println("After login into the application home page will be displayed");
    }

}
