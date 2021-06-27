//Switching between iframe window

package Selenium_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Iframe {

    public static void main(String[] args) throws InterruptedException, ParseException {
        System.out.println("Hello");

        String chromebinary = "G:\\Study\\Seleniumprojects\\Browserdriver\\chromedriver79.exe";
        System.setProperty("webdriver.chrome.driver", chromebinary);
        System.setProperty("webdriver.chrome.silentOutput", "true"); //To remove warnings

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver\n");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        //driver.switchTo().frame(0);
        //driver.findElement(By.cssSelector("input[type='text']")).sendKeys("ABCD");

        driver.switchTo().frame(1);
        Boolean found = false;

        WebElement animals = driver.findElement(By.id("animals"));
        Select animaldropdown = new Select(animals);
        List<WebElement> options = animaldropdown.getOptions();
        String dog = "Dog";

        for(int i=0; i<options.size(); i++) {

            if(dog.equals(options.get(i).getText()) == true)
            {
                //System.out.println(dog.equals(options.get(i).getText()));
                found=true;
                break;
            }
        }

        if(found) {
            System.out.println("Value exists");
        }

        else {
            System.out.println("Value not exists");
            driver.switchTo().defaultContent();
            driver.switchTo().frame(0);
            driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Dog");

        }

        Thread.sleep(5000);
        driver.quit();
    }
}