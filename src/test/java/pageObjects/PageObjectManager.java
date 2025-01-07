package pageObjects;
// This class is responsible to crete all objects , and also known as object factory
// so this approach is well known as factory design pattern

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public LandingPage landingPage;
    public AdminPage adminPage;
    public DashBoardPage dashBoardPage;
    public LeavePage leavePage;
    public WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public LandingPage getLandingPage(){
        landingPage=new LandingPage(driver);
        return landingPage;
    }

    public AdminPage getAdminPage(){
       return adminPage = new AdminPage(driver);
    }

    public DashBoardPage getDashBoardPage(){
        return dashBoardPage = new DashBoardPage(driver);
    }

    public LeavePage getLeavePage(){
        return leavePage = new LeavePage(driver);
    }

}
