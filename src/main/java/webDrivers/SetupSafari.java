package webDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class SetupSafari {
    public static void main(String[] args) {

    }
    public static WebDriver driver2=null;

    public static WebDriver SetupSafari(String platform,String Url,String browser){
        System.setProperty("webdriver.sfari.driver","/Users/user/Documents/ReviewTest/src/main/resources/driver/SafariDriver.safariextz");

        driver2= new SafariDriver();
        driver2.get(Url);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return driver2;
    }
    @Test
    public void SafariTest(){
        SetupSafari("mac","https:/www.forum.piit.us","safari");

    }













}
