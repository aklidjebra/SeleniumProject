package webDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.sql.SQLOutput;

public class SetupAllDriversMain {
    public static WebDriver driver = null;
    public static String Browser = "Chrome";
    public static String platform = "mac";

    public static void main(String[] args) {


        if (Browser.equalsIgnoreCase("safari") && platform.equalsIgnoreCase("mac")) {
            System.setProperty("webdriver.safari.driver", "/Users/user/Documents/ReviewTest/src/main/resources/driver/chromedriver.exe");
            driver = new SafariDriver();
            driver.get("https://www.amazon.com");
        } else if (Browser.equalsIgnoreCase("Chrome") && platform.equalsIgnoreCase("mac")) {
            System.setProperty("webdriver.chrome.driver", "/Users/user/Documents/ReviewTest/src/main/resources/driver/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://www.amazon.com");

        } else if (Browser.equalsIgnoreCase("firefox") && platform.equalsIgnoreCase("mac")) {
            System.setProperty("webdriver.safari.driver", "/Users/user/Documents/ReviewTest/src/main/resources/driver/chromedriver.exe");
            driver = new FirefoxDriver();
            driver.get("https://www.amazon.com");

        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        driver.quit();


    }

}
