package Selenium_Chrome;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxExample {
        public static void main(String[] args) throws InterruptedException {
            System.out.println("Hello");

            String chromebinary = "G:\\Study\\Seleniumprojects\\Browserdriver\\chromedriver79.exe";
            System.setProperty("webdriver.chrome.driver", chromebinary);
            System.setProperty("webdriver.chrome.silentOutput", "true"); //To remove warnings
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
            driver.manage().window().maximize();

            /*wait for Grid to Appear*/
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".demo-container")));

            /*Get the text before performing an ajax call*/
            WebElement noDatesTextElement = driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
            String textBeforeAjaxCall = noDatesTextElement.getText().trim();

            /*Click on the date*/
            driver.findElement(By.linkText("1")).click();

            /*Wait for loader to disappear */
            By loader = By.className("raDiv");
            wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));

            /*Get the text after ajax call*/
            WebElement selectedDatesTextElement = driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));

            wait.until(ExpectedConditions.visibilityOf(selectedDatesTextElement));
            String textAfterAjaxCall = selectedDatesTextElement.getText().trim();

            /*Verify both texts before ajax call and after ajax call text.*/
            Assert.assertNotEquals(textBeforeAjaxCall, textAfterAjaxCall);

            String expectedTextAfterAjaxCall = "Wednesday, April 1, 2020";

            /*Verify expected text with text updated after ajax call*/
            Assert.assertEquals(textAfterAjaxCall, expectedTextAfterAjaxCall);

            driver.close();
        }
    }

