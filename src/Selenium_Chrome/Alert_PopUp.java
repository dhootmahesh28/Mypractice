package Selenium_Chrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class Alert_PopUp {

    public static void main(String[] args) throws InterruptedException, ParseException {
        System.out.println("Hello");

        String chromebinary = "G:\\Study\\Seleniumprojects\\Browserdriver\\chromedriver79.exe";
        System.setProperty("webdriver.chrome.driver", chromebinary);
        System.setProperty("webdriver.chrome.silentOutput", "true"); //To remove warnings

        /* Alert /*
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php\n");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Alert alert =driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(5000);
        alert.accept();
        Thread.sleep(5000);
        driver.quit();           */


        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/tag/action-class/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("img[class='cp-close-img lazyloading']")).click();
        driver.findElement(By.id("cookie_action_close_header")).click();

        Thread.sleep(3000);


        Actions obj = new Actions(driver);
        WebElement Demosites = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/a/span/span"));
        WebElement Handling_Alert = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/ul/li[5]/a/span/span[1]"));
        
        obj.moveToElement(Demosites).moveToElement(Handling_Alert).click().build().perform();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        obj.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/p[7]/button")).click();
        Thread.sleep(2000);
        Alert alert =driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/p[10]/button")).click();
        Thread.sleep(2000);
        alert.dismiss();
        Thread.sleep(5000);

        driver.close();

    }
}