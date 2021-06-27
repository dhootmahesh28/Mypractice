//Simple Basic Program

package Selenium_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class SimpleBasicProgram {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");

        String chromebinary="G:\\Study\\Seleniumprojects\\Browserdriver\\chromedriver79.exe";
        System.setProperty("webdriver.chrome.driver", chromebinary);
        System.setProperty("webdriver.chrome.silentOutput","true"); //To remove warnings
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling info bars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.setExperimentalOption("useAutomationExtension", false); //Mandatory to use in automation

        ChromeDriver driver = new ChromeDriver(options);

        String baseUrl = "https://www.facebook.com";

        driver.get(baseUrl);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        String title = driver.getTitle();
        System.out.println(title);  // To Print Title

        String url = driver.getCurrentUrl();
        System.out.println(url);  // To Print current URL

        String windowhandle = driver.getWindowHandle();
        System.out.println(windowhandle);

        driver.close();

    }
}

