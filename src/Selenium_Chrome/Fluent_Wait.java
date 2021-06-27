//Fluent Wait

package Selenium_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


    public class Fluent_Wait {
        public static void main(String[] args) throws InterruptedException {
            System.out.println("Hello");

            String chromebinary = "G:\\Study\\Seleniumprojects\\Browserdriver\\chromedriver79.exe";
            System.setProperty("webdriver.chrome.driver", chromebinary);
            System.setProperty("webdriver.chrome.silentOutput", "true"); //To remove warnings
            ChromeDriver driver = new ChromeDriver();
            driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();

            FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                    .withTimeout(30, TimeUnit.SECONDS)
                    .pollingEvery(5, TimeUnit.SECONDS)
                    .ignoring(NoSuchElementException.class);

            WebElement element = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    WebElement element = driver.findElement(By.xpath("//*[@id='demo']"));
                    String getTextOnPage = element.getText();
                    if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
                        System.out.println(getTextOnPage);
                        return element;
                    }else{
                        System.out.println("FluentWait Failed");
                        return null;
                    }
                }
            });

            driver.close();

        }
    }

