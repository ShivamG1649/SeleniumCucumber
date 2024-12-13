package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");




        //true / false

        //isDisplay ( on the page , true , false not there )


        WebElement logo=  driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        boolean status = logo.isDisplayed();
        System.out.println(status);


        // isEnabled()

       boolean statusFirstName= driver.findElement(By.xpath("//input[@id='FirstName']"))
                .isEnabled();

        System.out.println(statusFirstName);



    }
}
