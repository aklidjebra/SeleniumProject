package webDrivers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SetupFireFox {
    public static WebDriver driver1 = null;

    public static WebDriver SetupFireFox(String platform, String Url, String Browser) {
        if (platform.equalsIgnoreCase("mac") && Browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/user/Documents/ReviewTest/src/main/resources/driver/geckodriver");
        } else if (platform.equalsIgnoreCase("windows") && Browser.equalsIgnoreCase("fireFox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/user/Documents/ReviewTest/src/main/resources/driver/geckodriver.exe");

        }
        driver1 = new FirefoxDriver();
        driver1.get(Url);
        driver1.manage().window().maximize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return driver1;
    }

    @Test
    public void searchsunGlasses() {
        SetupFireFox("mac", "https://www.amazon.com", "firefox");
        driver1.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("sunglasses");
        driver1.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
        driver1.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img")).click();
        driver1.navigate().to("https://youtube.com");
        driver1.navigate().to("https://www.google.com");
        driver1.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("how many countries in the world");
        driver1.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[1]")).click();



    }
}