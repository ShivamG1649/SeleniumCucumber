package stepDefinitions;

import utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.LeavePage;

import java.util.List;

public class LeavePageStepDefinition {
    TestContext testContext;
    LeavePage lp;
    public LeavePageStepDefinition(TestContext testContext){
        this.testContext=testContext;
    }
    @Given("Navigate to leave page")
    public void clickOnLeavePageLink() throws InterruptedException {
      //  this.lp = new LeavePage(testContext.driver);
           this.lp=testContext.pageObjectManager.getLeavePage();
           lp.navigateToLeavePage();
    }

    @When("fill all data as below table")
    public void fill_all_data_as_below_table(List<String> data) {
        testContext.driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]")).sendKeys(data.get(0));
        testContext.driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]")).sendKeys(data.get(1));

        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }
    @When("Click on search button on leave page")
    public void click_on_search_button_on_leave_page() {
        System.out.println("debug");
    }
}
