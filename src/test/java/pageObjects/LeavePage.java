package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage {
    public WebDriver driver;
    //Create a constructor
   public LeavePage(WebDriver driver){
    this.driver =driver;
   }

   // Navigate to leave page

    public void navigateToLeavePage(){
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
    }

}
