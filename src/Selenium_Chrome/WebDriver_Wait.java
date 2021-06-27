//Web Driver Wait and Select Dropdown

package Selenium_Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriver_Wait {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");

        String chromebinary = "G:\\Study\\Seleniumprojects\\Browserdriver\\chromedriver79.exe";
        System.setProperty("webdriver.chrome.driver", chromebinary);
        System.setProperty("webdriver.chrome.silentOutput", "true"); //To remove warnings
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //Web Driver Wait
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("programming-languages")));

        //Select DropDown
        Select dropdown = new Select(driver.findElement(By.id("programming-languages")));
        dropdown.selectByIndex(2);
        System.out.println(dropdown.isMultiple());
        Thread.sleep(5000);

        driver.close();
    }
}