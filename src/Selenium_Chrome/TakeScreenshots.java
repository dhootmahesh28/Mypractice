package Selenium_Chrome;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

;

public class TakeScreenshots {

     static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, ParseException, IOException {
        System.out.println("Hello");

        String chromebinary = "G:\\Study\\Seleniumprojects\\Browserdriver\\chromedriver79.exe";
        System.setProperty("webdriver.chrome.driver", chromebinary);
        System.setProperty("webdriver.chrome.silentOutput", "true"); //To remove warnings
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling info bars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.setExperimentalOption("useAutomationExtension", false); //Mandatory to use in automation

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


        /*ScreenShot*/
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("G:\\Study\\Screenshots_Taken\\Screen.png"));
        System.out.println("the Screenshot is taken");

        WebElement username = driver.findElement(By.id("email"));
        username.clear();
        username.sendKeys("9404604991");

        File source1 = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source1, new File("G:\\Study\\Screenshots_Taken\\Screen1.png"));
        System.out.println("the Screenshot is taken");

        WebElement pass = driver.findElement(By.id("pass"));
        pass.clear();
        pass.sendKeys("Shital@1993" + Keys.ENTER);

        File source2 = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source2, new File("G:\\Study\\Screenshots_Taken\\Screen2.png"));
        System.out.println("the Screenshot is taken");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[21]/div[1]")).click();

        File source3 = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source3, new File("G:\\Study\\Screenshots_Taken\\Screen3.png"));
        System.out.println("the Screenshot is taken");

        driver.close();

    }

}