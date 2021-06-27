//Find web element by Xpath locator

package Selenium_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Xpath_Practice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");

        String chromebinary = "G:\\Study\\Seleniumprojects\\Browserdriver\\chromedriver79.exe";
        System.setProperty("webdriver.chrome.driver", chromebinary);
        System.setProperty("webdriver.chrome.silentOutput", "true"); //To remove warnings
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));  //tagname[@attribute = 'value']
        //fname.sendKeys("mahesh");
        driver.findElement(By.xpath("//div[text()='Birthday']"));          //text() Method
        driver.findElement(By.xpath("//input[contains(@name,'email')]"));  //Contains() Method
        driver.close();
    }
}