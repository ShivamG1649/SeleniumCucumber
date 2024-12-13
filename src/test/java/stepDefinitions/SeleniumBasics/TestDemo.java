package stepDefinitions.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("Https://google.com");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("sfdsd");

        //getTitle() to find out the title of a page
    }
}
