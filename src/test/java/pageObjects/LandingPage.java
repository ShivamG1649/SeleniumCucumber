package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;
    //Create a constructor
   public LandingPage(WebDriver driver){
    this.driver =driver;
   }

    By userName = By.xpath("//input[@placeholder='Username']"); // Page Objects
    By password = By.xpath("//input[@placeholder='Password']");
    By loginBtn=By.xpath("//button[@type='submit']");

    public void enterUserName(String name){
         driver.findElement(userName).sendKeys(name);
    }

    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickOnLogInBtn(){
        driver.findElement(loginBtn).click();
    }
}
