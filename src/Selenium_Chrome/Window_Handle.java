package Selenium_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class Window_Handle {

    public static void main(String[] args) throws InterruptedException, ParseException {
        System.out.println("Hello");

        String chromebinary = "G:\\Study\\Seleniumprojects\\Browserdriver\\chromedriver79.exe";
        System.setProperty("webdriver.chrome.driver", chromebinary);
        System.setProperty("webdriver.chrome.silentOutput", "true"); //To remove warnings

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        String parentHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@id='win1']")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        for (String winHandle : driver.getWindowHandles()) {   //New Window Handle
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
        }

        driver.findElement(By.xpath("//input[@class= 'gLFyf gsfi']")).sendKeys("ABCD");
        Thread.sleep(5000);
        driver.switchTo().window(parentHandle);
        Thread.sleep(5000);
        driver.quit();

    }
}