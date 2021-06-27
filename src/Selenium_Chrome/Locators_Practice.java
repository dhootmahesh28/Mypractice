//Find Web Elements by Different types of Locators

package Selenium_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Locators_Practice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");

        String chromebinary = "G:\\Study\\Seleniumprojects\\Browserdriver\\chromedriver79.exe";
        System.setProperty("webdriver.chrome.driver", chromebinary);
        System.setProperty("webdriver.chrome.silentOutput", "true"); //To remove warnings
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

       /*
        WebElement username =driver.findElement(By.className("login_form_input_box")); //Username
       //username.sendKeys("9404604991");
        WebElement password = driver.findElement(By.name("pass"));  //Password
       //password.sendKeys("Shital@1997");
        WebElement login =driver.findElement(By.id("u_0_b"));  //Login
       //login.click();
        WebElement link = driver.findElement(By.linkText("Terms")); //Link
       // link.click();
        List<WebElement> policy = driver.findElements(By.partialLinkText("Policy"));  //Partial Link text
        driver.findElements(By.partialLinkText("Policy")).size();
        policy.get(0).click();
        policy.get(1).click();              */

       /*
       driver.findElement(By.cssSelector("#email"));  //css Selector
       driver.findElement(By.cssSelector("#pass"));
       driver.findElement(By.cssSelector(".login_form_input_box"));           */

       /*
       WebElement Tagname = driver.findElement(By.cssSelector("input[aria-label='First name']")); // Tag Name
       Tagname.sendKeys("Mahesh");           */


       /*Substring matches*/
       /*
       List <WebElement> substringMatch = driver.findElements(By.cssSelector("input[id^='u_0_']"));
       System.out.println(substringMatch.size());

       substringMatch.get(3).sendKeys("Mahesh");
       substringMatch.get(4).sendKeys("Dhoot");
       substringMatch.get(5).sendKeys("dhootmahesh28@gmail.com");             */


        Thread.sleep(5000);
        driver.close();
    }
}