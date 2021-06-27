//Automation form Practice

package Selenium_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutomationForm {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");

        String chromebinary = "G:\\Study\\Seleniumprojects\\Browserdriver\\chromedriver79.exe";
        System.setProperty("webdriver.chrome.driver", chromebinary);
        System.setProperty("webdriver.chrome.silentOutput", "true"); //To remove warnings
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        Firstname.sendKeys("Mahesh");
        Thread.sleep(2000);
        WebElement Lastname  = driver.findElement(By.xpath("//input[@id='lastname']"));
        Lastname.sendKeys("Dhoot");
        Thread.sleep(2000);
        WebElement Sex = driver.findElement(By.xpath("//input[@id='sex-0']"));
        Sex.click();
        Thread.sleep(2000);
        WebElement exp = driver.findElement(By.xpath("//input[@id='exp-2']"));
        exp.click();
        Thread.sleep(2000);
        WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("11/04/2020");
        Thread.sleep(2000);
        WebElement Profession = driver.findElement(By.xpath("//input[@id='profession-1']"));
        Profession.click();
        Thread.sleep(2000);
        WebElement tool = driver.findElement(By.xpath("//input[@id='tool-2']"));
        tool.click();
        Thread.sleep(2000);
        WebElement Testdropdown = driver.findElement(By.id("continents"));
        Select dropdown = new Select(Testdropdown);
        dropdown.selectByIndex(3);
        Thread.sleep(2000);
        WebElement Multipledropdown = driver.findElement(By.id("continentsmultiple"));
        Select dropdown1 = new Select(Multipledropdown);
        dropdown1.selectByValue("AS");
        dropdown1.selectByValue("AF");
        Thread.sleep(2000);
        WebElement commands = driver.findElement(By.id("selenium_commands"));
        Select dropdown2 = new Select(commands);
        dropdown2.selectByVisibleText("WebElement Commands");
        Thread.sleep(2000);
        WebElement Button = driver.findElement(By.xpath("//button[@id='submit1']"));
        Button.click();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.close();
    }
}