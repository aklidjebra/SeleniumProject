package webDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetupChrome {

    public static WebDriver driver =null;



    public static WebDriver setdriver(String platforme, String url,String Name ){

        if (platforme.equalsIgnoreCase("mac")&&Name.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");}
        else if (platforme.equalsIgnoreCase("windows")&& Name.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");}
        driver  =new ChromeDriver();
        driver.get (url);


return driver;

    }


    public static void main(String[] args) {
        setdriver("mac","https://www.facebook.com","chrome");



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();



    }
}
