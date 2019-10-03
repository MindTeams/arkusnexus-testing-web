package manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;


public class InitializePage {

    public static WebDriver driver = DriverManager.getDriver();

    protected void init(Class page) {
        PageFactory.initElements(driver, page);
    }

}
