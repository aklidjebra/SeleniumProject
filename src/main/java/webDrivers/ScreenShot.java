package webDrivers;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot extends SetupChrome {
    public static void main(String[] args) {

        setdriver("mac", "https://www.ebay.com", "chrome");
        ScreenShot scr = new ScreenShot();
        scr.getScreenShot(driver);


    }

    public void getScreenShot(WebDriver driver) {

        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-hh:mm)");
        Date date = new Date();
        String name = df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file, new File("src/ScrShot/" + name + ".png"));
        } catch (Exception e) {
            e.printStackTrace();

        }
        driver.quit();
    }
}
