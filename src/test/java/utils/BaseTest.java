package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
  public WebDriver driver;
    public WebDriver webDriverManager() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//qa.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String qaUrl=prop.getProperty("qaApplicationUrl");
        if(driver==null) {
            if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            else if(prop.getProperty("browser").equalsIgnoreCase("fireFox")){
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }

            else if(prop.getProperty("browser").equalsIgnoreCase("Edge")) {
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(qaUrl);
            driver.manage().window().maximize();
        }
       return driver;
    }
}
