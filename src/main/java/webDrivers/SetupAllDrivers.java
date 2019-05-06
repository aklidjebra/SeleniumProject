package webDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class SetupAllDrivers {

    public static WebDriver driver= null;

    public static WebDriver SetupAllDrivers(String platform, String Url, String Browser){

        if(platform.equalsIgnoreCase("mac")&& Browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
            driver = new ChromeDriver();


        }else if (platform.equalsIgnoreCase("mac")&& Browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", "src/main/resources/driver/geckodriver");
            driver= new FirefoxDriver();
            driver.get("https://www.yahoo.com");


        }else if (platform.equalsIgnoreCase("mac")&& Browser.equalsIgnoreCase("Safari")){
            System.setProperty("webdriver.safari.driver", "src/main/resources/driver/geckodriver.exe");
            driver= new SafariDriver();
        }
        driver.get(Url);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return driver;
    }
    @Test
    public void DriversTest(){
        SetupAllDrivers("mac","https://www.facebook.com","Firefox");
        driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.quit();




    }


}
