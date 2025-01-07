package utils;
import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

import java.io.IOException;

public class TestContext {
      public WebDriver driver;
    //public String userName;
    public PageObjectManager pageObjectManager;
    public BaseTest baseTest;
    public GenericUtils genericUtils;
    // Create one constructor
    public TestContext() throws IOException {
        baseTest = new BaseTest();
     pageObjectManager=new PageObjectManager(baseTest.webDriverManager());
     genericUtils = new GenericUtils(baseTest.webDriverManager());
     this.driver= baseTest.webDriverManager();
    }
}
