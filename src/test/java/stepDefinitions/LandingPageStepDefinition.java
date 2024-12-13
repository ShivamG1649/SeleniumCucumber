package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPageStepDefinition {

     WebDriver driver;
    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://accounts.shutterfly.com/");


        driver.manage().window().maximize();
         Thread.sleep(5000);
       // driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gulati.shivam2008@gmail.com");
       // driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gulati.shivam2008@gmail.com");
    }
    @When("user login into application")
    public void user_login_into_application() {

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gulati.shivam2008@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Winter@100");

        // click on sign in button

        driver.findElement(By.xpath("//body/div[@id='root']/div[@class='app-container language-en ']/div[1]/div[3]/form[1]/div[1]/button[1]")).click();
    }
    @Then("home page is displayed")
    public void home_page_is_displayed() {
        System.out.println("After login into the application home page will be displayed");
    }

}
