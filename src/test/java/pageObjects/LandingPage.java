package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

public WebDriver driver;
    //Create a constructor
   public LandingPage(WebDriver driver){
    this.driver =driver;
   }

    By userName = By.xpath("//input[@id='email']"); // Page Objects

    public void enterUserName(String userName){


        driver.findElement(new By.ByXPath(userName)).sendKeys("gulati.shivam2008@gmail.com");


    }
}
