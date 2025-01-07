package stepDefinitions;

import utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.AdminPage;
import pageObjects.PageObjectManager;

public class AdminPageStepDefinition {
    TestContext testContext;
    AdminPage ap;
    PageObjectManager pageObjectManager;
    public AdminPageStepDefinition(TestContext testContext){
        this.testContext=testContext;
    }
    @Given("Click on admin link on left Side panel")
    public void clickOnAdminLink() throws InterruptedException {
 //       pageObjectManager = new PageObjectManager(testContext.driver);
//        this.ap = new AdminPage(testContext.driver);
        ap=  testContext.pageObjectManager.getAdminPage();
        ap.clickOnAdminPageLink();
        ap.navigateToAdminPage();
    }

    @When("Select Role {string}")
    public void select_role(String role) {
        // click on Select down arrow
        testContext.driver.findElement(By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
        // Select the Role" //div[@title ='" + i + "']"
        testContext.driver.findElement(By.xpath("//span[contains(text(),'"+role+"')]")).click();
    }

}
