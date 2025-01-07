package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    public WebDriver driver;
    //Create a constructor
   public AdminPage(WebDriver driver){
    this.driver =driver;
   }
    By AdminPageLink =By.xpath("//a[@class='oxd-main-menu-item active']");


    public void clickOnAdminPageLink(){
         driver.findElement(AdminPageLink).click();
    }

    // Navigate to admin page

    public void navigateToAdminPage(){
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
    }

}
