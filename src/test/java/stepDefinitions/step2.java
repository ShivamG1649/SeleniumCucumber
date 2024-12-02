package stepDefinitions;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class step2 {
    WebDriver driver;
    @Given("OpenLogin page and enter userName and password")
    public void open_login_page_and_enter_user_name_and_password() {
        System.out.println("First step");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}
