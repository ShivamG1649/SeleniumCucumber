import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoTest {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https:google.com");

        driver.manage().window().maximize();

        //to maximize window
        driver.
                findElement(By.xpath("//textarea[@id='APjFqb']"))

                .sendKeys("gulati.shivam2008@gmail.com");



        driver.
                findElement(By.xpath("//input[@id='email']"))

                .sendKeys("gulati.shivam2008@gmail.com");



//
//        driver.close();
    }
}
