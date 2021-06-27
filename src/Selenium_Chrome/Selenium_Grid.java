package Selenium_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium_Grid {
    public static void main(String[] args) throws MalformedURLException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling info bars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.setExperimentalOption("useAutomationExtension", false); //Mandatory to use in automation


        String baseURL = "http://demo.guru99.com/test/guru99home/";
        String nodeURL = "http://192.168.43.223:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.WIN10);
        WebDriver driver = new RemoteWebDriver(new URL(nodeURL), options);
        driver.get(baseURL);
        driver.findElement(By.className("dropdown-toggle")).click();
        driver.close();
    }
}