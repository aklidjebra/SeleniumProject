package webDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class DesignSetupChrome {
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
    @AfterTest
    public void Quit() {
       //driver.quit();
    }
        @Test
         public  void  EbayBook(){
        setdriver("mac","https://www.ebay.com","chrome");



            driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("java books");
            driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
            driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a/h3")).click();
            driver.findElement(By.xpath("//*[@id=\"qtyTextBox\"]")).clear();
            driver.findElement(By.xpath("//*[@id=\"qtyTextBox\"]")).sendKeys("2");
            driver.findElement(By.xpath("//*[@id=\"qtyTextBox\"]")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.navigate().back();
            driver.navigate().to("https://yahoo.com");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }



}



