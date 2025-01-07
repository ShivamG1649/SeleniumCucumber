package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
    public WebDriver driver;
    // Constructor creation
    public DashBoardPage(WebDriver driver){
        this.driver=driver;
    }

    By OrangeHRMLogo = By.xpath("//img[@alt='client brand banner']");

    public boolean verifyHRLLogo(){
        return driver.findElement(OrangeHRMLogo).isDisplayed();
    }
}
