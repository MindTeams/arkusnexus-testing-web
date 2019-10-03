package manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class DriverManager {

    public static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {
            driver = createDriver();
            driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        return driver;
    }


    private static WebDriver createDriver() {
        ProjectProperties.readProperties();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manuel\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        if (ProjectProperties.properties.getProperty("browser.name").equals("Firefox")) {
            driver = new FirefoxDriver();
        } else if (ProjectProperties.properties.getProperty("browser.name").equals("Chrome")) {
            driver = new ChromeDriver();
        }
        return driver;
    }


}
