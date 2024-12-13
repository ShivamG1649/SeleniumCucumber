package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class BrowserMethods {


    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);// used to pause the execution


        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();


       //  String title = driver.getTitle();
       // System.out.println(title);

        // getCurrentURL() , to return the URL of application

//         String currentURL =  driver.getCurrentUrl();
//        System.out.println(currentURL);

        // getWindowHandle() -> it will return window id
        //getWindowHandles()   -> It will return window id of all the window running

//        String  windowID= driver.getWindowHandle();
//        System.out.println("window is "+windowID);  //A05442B2E20DAD7BC3A5606AF0629B63
//                                                    //F7809BBC87289EC6EEB16EA507366C5C


        Set<String> windows = driver.getWindowHandles();
        System.out.println("window id set "+windows);

        Thread.sleep(3000);

       // driver.close();close method will close the window ( one window)

       // driver.quit();  it will close all open windows

        WebElement abc= driver.findElement(By.xpath("//a[@id='Edit_1ebda621-219a-11ef-af0c-c769e9cd9c39']"));

        List<WebElement> list= driver.findElements(By.xpath("//div[@class ='card-title-text show']"));


    }



}
