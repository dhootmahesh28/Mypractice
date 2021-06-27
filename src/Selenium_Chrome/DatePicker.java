//Action Class, New window Handle, Date Picker

package Selenium_Chrome;

import org.joda.time.DateTime;
import org.joda.time.Months;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class DatePicker {
    public static void main(String[] args) throws InterruptedException, ParseException {
        System.out.println("Hello");

        String chromebinary = "G:\\Study\\Seleniumprojects\\Browserdriver\\chromedriver79.exe";
        System.setProperty("webdriver.chrome.driver", chromebinary);
        System.setProperty("webdriver.chrome.silentOutput", "true"); //To remove warnings

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/tag/action-class/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //Action Class
        Actions obj = new Actions(driver);
        WebElement Demosites = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/a/span/span"));
        WebElement Basic = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/ul/li[1]/a/span/span"));

        String parentHandle = driver.getWindowHandle();   //New Window Handle
        obj.moveToElement(Demosites).moveToElement(Basic).click().build().perform();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        for (String winHandle : driver.getWindowHandles()) {   //New Window Handle
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
        }

        //Date Picker
        driver.findElement(By.cssSelector("a[href='https://demoqa.com/datepicker/']")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("datepicker")).click();
        Thread.sleep(3000);

        String setdatestr = "02/01/2020";  //dd/MM/yyyy
        String currentdatestr = driver.findElement(By.className("ui-datepicker-title")).getText(); //MMMM yyyy

        Date setdate = new SimpleDateFormat("dd/MM/yyyy").parse(setdatestr);
        Date currentdate = new SimpleDateFormat("MMMM yyyy").parse(currentdatestr);

        int monthdiff = Months.monthsBetween(new DateTime(currentdate).withDayOfMonth(1), new DateTime(setdate).withDayOfMonth(1)).getMonths();

        boolean isFuture = true;
        if(monthdiff < 0){
            isFuture=false;
            monthdiff = -1 * monthdiff;
        }

        for(int i=0;i<monthdiff;i++){
            if(isFuture)
                driver.findElement(By.xpath("//span[text()='Next'] ")).click();
            else
                driver.findElement(By.xpath("//span[text()='Prev'] ")).click();
        }

        String day;
        day = new SimpleDateFormat("dd").format(setdate);
        driver.findElement(By.xpath("//a[text()='"+Integer.parseInt(day)+"']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}